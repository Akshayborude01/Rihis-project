package com.spring.user.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.DcKidEntity;

public interface DcKidRepo extends JpaRepository<DcKidEntity, Serializable> {

	public List<DcKidEntity> findByCaseNum(long caseNum);
}
