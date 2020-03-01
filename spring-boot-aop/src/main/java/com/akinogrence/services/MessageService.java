package com.akinogrence.services;

import com.akinogrence.entity.Message;
import com.akinogrence.entity.User;

import java.util.HashMap;
import java.util.List;

public interface MessageService {

    public Message sendMessageWithUser(Message message);
    public List<Message> getAllMessage();



}
