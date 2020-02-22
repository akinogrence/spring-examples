package com.akinogrence.repository;

import com.akinogrence.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User,String> {
}
