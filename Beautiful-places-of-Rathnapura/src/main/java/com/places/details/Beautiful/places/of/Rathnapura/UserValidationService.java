package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.details.Beautiful.places.of.Rathnapura.jpa.RegistrationRepository;

@Service
public class UserValidationService {

	@Autowired
	RegistrationRepository registrationRepo;
	
	public List<String> getUserDetails() {
		List<String> list = new ArrayList<>();
		for(int i=0; i< registrationRepo.findAll().size();i++) {
			list.add(registrationRepo.findAll().get(i).getFirst_name());
		}
		return list;
	}
	
	public List<String> getUserPassword() {
		List<String> listOfPassword = new ArrayList<>();
		for(int i=0; i< registrationRepo.findAll().size();i++) {
			listOfPassword.add(registrationRepo.findAll().get(i).getPassword());
		}
		return listOfPassword;
	}
}
