package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.VCPlanEntity;

public interface VCWPlanRepo extends JpaRepository<VCPlanEntity, Serializable>{

}
