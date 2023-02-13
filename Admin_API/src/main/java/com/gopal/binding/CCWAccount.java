package com.gopal.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CCWAccount {
	
	private Integer caId;
	private String fullName;
	private String emailId;
	private Long mobNum;
	private Boolean gender;
	private LocalDate dob;
	private Integer ssn;
	
	

}
