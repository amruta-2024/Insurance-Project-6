package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
