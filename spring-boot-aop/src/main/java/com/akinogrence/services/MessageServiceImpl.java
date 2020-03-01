package com.akinogrence.services;

import com.akinogrence.entity.Message;
import com.akinogrence.entity.User;
import com.akinogrence.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;



    @Override
    public Message sendMessageWithUser(Message message) {
        messageRepository.save(message);

        return message;
    }

    @Override
    public List<Message> getAllMessage() {

    return messageRepository.findAll();
    }




}
