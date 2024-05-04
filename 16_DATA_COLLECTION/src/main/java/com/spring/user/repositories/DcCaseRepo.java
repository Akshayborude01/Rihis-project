package com.spring.user.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.DcCaseEntity;

public interface DcCaseRepo extends JpaRepository<DcCaseEntity, Serializable> {

}
