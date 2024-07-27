package me.dio.service;

import me.dio.domain.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

    List<User> findAll();
}