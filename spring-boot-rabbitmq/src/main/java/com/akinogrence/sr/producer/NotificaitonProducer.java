package com.akinogrence.sr.producer;


import com.akinogrence.sr.model.Notification;
import java.util.Date;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificaitonProducer {


    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;


    @PostConstruct
    public void init() {
        Notification notification = new Notification();
        notification.setId(UUID.randomUUID().toString());
        notification.setCreatedAt(new Date());
        notification.setMessage("My First Test Message ! ");
        notification.setSeen(Boolean.FALSE);

        sendToQueue(notification);
    }

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendToQueue(Notification notification) {
        System.out.println("Notification Sent ID : " + notification.getId());
        rabbitTemplate.convertAndSend(exchangeName,routingName,notification);
    }
}
