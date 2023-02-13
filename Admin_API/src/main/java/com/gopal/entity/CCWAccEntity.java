package com.gopal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CREATE_CW_ACC")
@Data
public class CCWAccEntity {
	@Id
	@GeneratedValue
	private Integer cwId;
	private String fullName;
	private String emailId;
	private Long mobNum;
	private Boolean gender;
	private LocalDate dob;
	private Integer ssn;
	private String cwPwd;
	private String accStatus;
	
	
}
