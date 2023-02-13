package com.gopal.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.ADPlanEntity;

public interface ADPlanRepo extends JpaRepository<ADPlanEntity, Serializable> {

	public List<ADPlanEntity> findByActiveSw(String status);
}
