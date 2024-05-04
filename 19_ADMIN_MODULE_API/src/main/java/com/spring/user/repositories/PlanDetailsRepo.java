package com.spring.user.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.PlanDetailsEntity;

public interface PlanDetailsRepo extends JpaRepository<PlanDetailsEntity, Serializable>{

	public List<PlanDetailsEntity> findByActiveSw(String status);
}
