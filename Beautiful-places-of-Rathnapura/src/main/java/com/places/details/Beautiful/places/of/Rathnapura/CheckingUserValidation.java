package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckingUserValidation {
	
	@Autowired
	UserValidationService userValidationService;

	public boolean isUservslid(String firstName, String password) {
		
		List<String> detailsName = userValidationService.getUserDetails();
		List<String> detailsPassword = userValidationService.getUserPassword();
		
		for(int i =0; i<detailsName.size() && i<detailsPassword.size(); i++) {
			if(firstName.equals(detailsName.get(i)) && password.equals(detailsPassword.get(i))) {
				return true;
			}
		}
		
		return false;
	}
}
