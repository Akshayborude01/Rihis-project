package com.spring.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Serializable> {

}
