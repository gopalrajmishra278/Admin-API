package com.gopal.repo;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.VCWAccEntity;



public interface VCWAccRepo extends JpaRepository<VCWAccEntity, Serializable> {

	//public Optional<CitizenAppEntity> findById(Integer appId);
	
	
}
