package com.gopal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CREATE_ACC")
@Data
public class VCWAccEntity {
	
	private Integer vaId;
	private String fullName;
	private String emailId;
	private Long mobNum;
	private Boolean gender;
	private LocalDate dob;
	private Integer ssn;
    private String accStatus;
	
}
