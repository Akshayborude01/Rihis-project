package com.spring.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.DcEducationEntity;

public interface DcEducationRepo extends JpaRepository<DcEducationEntity, Serializable> {

	public DcEducationEntity findByCaseNum(long caseNum);
}
