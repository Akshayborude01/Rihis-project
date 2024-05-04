package com.spring.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.DcCaseEntity;

public interface DcCaseRepository extends JpaRepository<DcCaseEntity, Serializable> {

	
}
