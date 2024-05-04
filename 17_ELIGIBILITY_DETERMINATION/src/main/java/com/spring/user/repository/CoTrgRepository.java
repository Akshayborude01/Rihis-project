package com.spring.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.CoTrgEntity;

public interface CoTrgRepository extends JpaRepository<CoTrgEntity, Serializable> {

}
