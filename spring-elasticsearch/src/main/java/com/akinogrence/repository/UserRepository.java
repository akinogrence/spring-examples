package com.akinogrence.repository;

import com.akinogrence.entity.User;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"name\": \"?0\"}}]}}")
    List<User> findSearching(String searchParameter);
    List<User>  findByNameLikeOrLastNameLike(String name, String lastName);
}

