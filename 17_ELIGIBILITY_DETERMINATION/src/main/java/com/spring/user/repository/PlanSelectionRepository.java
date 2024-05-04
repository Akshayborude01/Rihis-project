package com.spring.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.PlanSelection;

public interface PlanSelectionRepository extends JpaRepository<PlanSelection, Serializable> {

	public PlanSelection findByplanName(Integer planId);
}
