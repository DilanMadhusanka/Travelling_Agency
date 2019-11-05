package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.details.Beautiful.places.of.Rathnapura.jpa.RestPlacesRepository;
import com.places.details.Beautiful.places.of.Rathnapura.model.RestPlacesModel;

@Service
public class RestPlacesService {
	
	@Autowired
	RestPlacesRepository restPlacesRepository;

	public List<RestPlacesModel> getRestPlacesDetails() {
		List<RestPlacesModel> list = new ArrayList<>();
		
		for(RestPlacesModel restPlaceModel : restPlacesRepository.findAll()) {
			list.add(restPlaceModel);
		}
		return list;
	}
}
