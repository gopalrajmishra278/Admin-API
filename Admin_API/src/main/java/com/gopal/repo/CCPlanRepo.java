package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.CCPlanEntity;

public interface CCPlanRepo extends JpaRepository<CCPlanEntity, Serializable>{
	
   

}
