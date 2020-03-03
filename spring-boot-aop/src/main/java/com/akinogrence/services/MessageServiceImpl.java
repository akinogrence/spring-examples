package com.akinogrence.services;

import com.akinogrence.entity.Message;
import com.akinogrence.repository.MessageRepository;
import com.akinogrence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;
    @Autowired
    UserRepository userRepository;


    @Override
    public Message sendMessageWithUser(Message message) {
        messageRepository.save(message);

        return message;
    }

    @Override
    public List<Message> getAllMessage() {

        return messageRepository.findAll();
    }

    public List<Message> getMessageforUser(String userID) {

        List<Message> messagesForUser = messageRepository.findAll();
        Iterator<Message> messageIterator = messagesForUser.iterator();

        while (messageIterator.hasNext()) {
            if (!messageIterator.next().getMessageSender().getId().equals(userID)) {
                messageIterator.remove();
            }
        }
        return messagesForUser;
    }
}
