package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.places.details.Beautiful.places.of.Rathnapura.jpa.PlacesRepository;
import com.places.details.Beautiful.places.of.Rathnapura.model.ImageModel;
import com.places.details.Beautiful.places.of.Rathnapura.model.PlacesModel;

@Controller
public class AppController {
	
	@Autowired
	ImageService imageService;
	
	@Autowired
	PlacesService placesService;
	
	@Autowired
	PlacesRepository placesRepository;

	@RequestMapping("/locations")
	public String showLocations(Model model) {
		List<ImageModel> contactList = imageService.getContactList();
		model.addAttribute("contacts", contactList);
		return "locations";
	}
	
	@RequestMapping("/placeDetails")
	public String showDetailsPlace(@RequestParam String name, Model model) {
		
		if(name.equals("1")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(0);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("2")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(1);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("3")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(2);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("4")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(3);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("5")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(4);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("6")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(5);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("7")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(6);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("8")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(7);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("9")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(8);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("10")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(9);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("11")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(10);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		else if(name.equals("12")) {
			List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
			PlacesModel placesModel = detailsList.get(11);
			model.addAttribute("details", placesModel);
			return "details";
		}
		
		return "details";
	}
	
	@RequestMapping("/searchLocation")
	public String searchLocation(@RequestParam String name, Model model) {
		List<PlacesModel> detailsList = placesService.getPlaceDetailsList();
		for(int index= 0; index <12; index++) {
						
			if(detailsList.get(index).getTopic().equals(name)) {
				PlacesModel placesModel = detailsList.get(index);
				model.addAttribute("details", placesModel);
				return "details";
			}
		}
		
		model.addAttribute("errorMessageHeader", "Sorry!!");
		model.addAttribute("errorMessage", "Can not find this location!!");
		return "details";
	}
	
}
