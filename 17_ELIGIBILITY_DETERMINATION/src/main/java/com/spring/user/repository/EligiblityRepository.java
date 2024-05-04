package com.spring.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.EligibilityResponse;

public interface EligiblityRepository extends JpaRepository<EligibilityResponse, Serializable> {

}
