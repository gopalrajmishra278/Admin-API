package com.gopal.service;

import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopal.binding.CCWAccount;
import com.gopal.entity.CCWAccEntity;
import com.gopal.repo.CCWAccountRepo;


@Service
public class CreateAccountImpl implements CreateAccount{
	
	@Autowired
	private CCWAccountRepo cwRepo;
	
	@Autowired
	private EmailUtils emailUtils;
	
	

	private Random random = new Random();
	
	@Override
	public String createCWAccount(CCWAccount cwAccount) {
		
//copy binding object into entity object
		
	    CCWAccEntity entity = new CCWAccEntity();
		
		BeanUtils.copyProperties(acc, entity);
		
		entity.setCwPwd(generateRandomPwd());
		
		entity.setAccStatus("Locked");
		
		 cwRepo.save(entity);
		
		 //sent pwd to unlock account
			
		 String to = cwAccount.getEmailId();
		 String subject = "Registration Email";
		 String body = readEmailBody("REG_EMAIL_BODY.txt", entity);
		 
		 emailUtils.sendEmail(to, subject, body);
		 
		
          return "User Account Created";
		}
	
      
	
	  private String generateRandomPwd() {
		
		
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		StringBuilder sb = new StringBuilder();
		int pwdLength = 6;
	    
	    for(int i=1; i < pwdLength; i++) {
	    	
	    	int index = random.nextInt(text.length());
	    	
	    	sb.append(text.charAt(index));
	    }
	    
	    
	       return sb.toString();
		
		}
	
	
	

	@Override
	public String viewCWAccount() {
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}

	@Override
	public String createCitizenPlan() {
		
		return null;
	}

	@Override
	public String viewCitizenPlan() {
		
		return null;
	}

}
