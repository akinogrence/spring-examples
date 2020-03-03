package com.akinogrence.controllers;


import com.akinogrence.entity.Message;
import com.akinogrence.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/messageOperations")
public class MessageController {

    @Autowired
    MessageService messageService;


    @GetMapping
    @RequestMapping("getMessage/{userID}")
    private ResponseEntity<List<Message>> getMessageforUser(@PathVariable String userID) {
        System.out.println("test");
        return ResponseEntity.ok(messageService.getMessageforUser(userID));
    }

    @PostMapping
    @RequestMapping("/sendMessage")
    private ResponseEntity<Message> sendMessageWithUser(@RequestBody Message message) {

        return ResponseEntity.ok(messageService.sendMessageWithUser(message));
    }

    @GetMapping
    @RequestMapping("/getMessages")
    private ResponseEntity<List<Message>> getAllMessages() {
        return ResponseEntity.ok(messageService.getAllMessage());
    }

}
