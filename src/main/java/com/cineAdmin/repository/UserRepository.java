package com.cineAdmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cineAdmin.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);
}
