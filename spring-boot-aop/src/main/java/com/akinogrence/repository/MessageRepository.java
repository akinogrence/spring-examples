package com.akinogrence.repository;

import com.akinogrence.entity.Message;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends MongoRepository<Message,String> {
}
