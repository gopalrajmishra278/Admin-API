package com.gopal.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CCPlan {
	
	
	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
	
	
}
