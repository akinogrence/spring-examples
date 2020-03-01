package com.akinogrence.repository;

import com.akinogrence.entity.User;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends MongoRepository<User,String> {
}
