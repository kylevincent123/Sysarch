package com.zagado.sysarch.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.zagado.sysarch.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    User findByUsername(String username);
    
}
