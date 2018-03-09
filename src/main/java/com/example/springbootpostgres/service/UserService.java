package com.example.springbootpostgres.service;

import com.example.springbootpostgres.entity.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = false)
    public UserEntity save (UserEntity user) {
        entityManager.persist(user);
        return user;
    }


}
