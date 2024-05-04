package com.spring.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.DcIncomeEntity;

public interface DcIncomeRepo extends JpaRepository<DcIncomeEntity, Serializable> {

	public DcIncomeEntity findByCaseNum(long caseNum);
}
