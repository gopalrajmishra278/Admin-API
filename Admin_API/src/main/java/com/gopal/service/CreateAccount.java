package com.gopal.service;

import com.gopal.binding.CCWAccount;

public interface CreateAccount {
	
	public String createCWAccount(CCWAccount acc);
	public String generateRandomPwd();
	
	public String viewCWAccount();
	public String createCitizenPlan();
	public String viewCitizenPlan();
	

}
