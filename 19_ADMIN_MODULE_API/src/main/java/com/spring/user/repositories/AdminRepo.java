package com.spring.user.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.AdminAccountEntity;

public interface AdminRepo extends JpaRepository<AdminAccountEntity, Serializable> {

	public List <AdminAccountEntity> findByActiveSw(String status);
}
