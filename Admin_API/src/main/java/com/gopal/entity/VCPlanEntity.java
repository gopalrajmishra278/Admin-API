package com.gopal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="CREATE_PLAN")
@Data
public class VCPlanEntity {
	@Id
	@GeneratedValue
	private Integer vpid;
	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
	
	

}
