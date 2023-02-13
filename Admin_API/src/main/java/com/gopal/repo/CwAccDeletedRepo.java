package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.CwAccDeletedEntity;

public interface CwAccDeletedRepo extends JpaRepository<CwAccDeletedEntity, Serializable> {
	
	

}
