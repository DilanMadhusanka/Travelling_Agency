package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.details.Beautiful.places.of.Rathnapura.model.RegistrationModel;

@Service
public class CheckingUserValidation {
	
	@Autowired
	UserValidationService userValidationService;

	public RegistrationModel isUservslid(String firstName, String password) {
		
		List<RegistrationModel> userDetails = userValidationService.getUserDetails();
		RegistrationModel registrationModel;
		
		for(int i =0; i<userDetails.size(); i++) {
			if(firstName.equals(userDetails.get(i).getFirst_name()) && password.equals(userDetails.get(i).getPassword())) {
				registrationModel = userDetails.get(i);
				return registrationModel;
			}
		}
		
		return null;
	}
}
