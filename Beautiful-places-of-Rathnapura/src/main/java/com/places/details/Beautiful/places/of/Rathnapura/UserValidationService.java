package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.details.Beautiful.places.of.Rathnapura.jpa.RegistrationRepository;
import com.places.details.Beautiful.places.of.Rathnapura.model.RegistrationModel;

@Service
public class UserValidationService {

	@Autowired
	RegistrationRepository registrationRepo;
	
	public List<RegistrationModel> getUserDetails() {
		List<RegistrationModel> list = new ArrayList<>();
		
		for(RegistrationModel registrationModel : registrationRepo.findAll()) {
			list.add(registrationModel);
		}
		
		return list;
	}
}
