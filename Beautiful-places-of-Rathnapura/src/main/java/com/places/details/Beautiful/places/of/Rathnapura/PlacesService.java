package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.details.Beautiful.places.of.Rathnapura.jpa.PlacesRepository;
import com.places.details.Beautiful.places.of.Rathnapura.model.PlacesModel;

@Service
public class PlacesService {

	@Autowired
	PlacesRepository placesRepository;
	
	public List<PlacesModel> getPlaceDetailsList() {
		List<PlacesModel> list = new ArrayList<>();
		
		for (PlacesModel placesModel : placesRepository.findAll()) {
			list.add(placesModel);
		}
		
		return list;
	}
}
