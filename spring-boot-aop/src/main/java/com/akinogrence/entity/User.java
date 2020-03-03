package com.akinogrence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;

@Document(collection = "users")
public class User {


    @Id
    private String id;
    private String userName;
    private String name;
    private String lastName;
    private String country;
    private List<Message> wasSendedMessages;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public List<Message> getWasSendedMessages() {
        return wasSendedMessages;
    }

    public void setWasSendedMessages(List wasSendedMessages) {
        this.wasSendedMessages = wasSendedMessages;
    }


}
