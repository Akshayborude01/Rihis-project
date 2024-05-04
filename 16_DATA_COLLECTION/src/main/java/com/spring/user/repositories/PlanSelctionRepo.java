package com.spring.user.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.PlanSelection;

public interface PlanSelctionRepo extends JpaRepository<PlanSelection, Serializable> {

}
