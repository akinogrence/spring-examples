package com.akinogrence.sr.listener;

import com.akinogrence.sr.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "akin-ogrence-queue")
    public void handleMessage(Notification notification)
    {
        System.out.println("Test Message Received!");
        System.out.println(notification.toString());
    }
}
