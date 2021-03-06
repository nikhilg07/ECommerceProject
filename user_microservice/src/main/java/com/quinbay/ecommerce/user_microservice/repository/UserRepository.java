package com.quinbay.ecommerce.user_microservice.repository;


import com.quinbay.ecommerce.user_microservice.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

    Optional<UserEntity> findByEmailAndPassword(String email,String password);
    Optional<UserEntity> findByEmail(String email);

}

