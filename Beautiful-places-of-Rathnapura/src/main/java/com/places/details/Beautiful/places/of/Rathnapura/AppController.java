package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.places.details.Beautiful.places.of.Rathnapura.jpa.PlacesRepository;
import com.places.details.Beautiful.places.of.Rathnapura.jpa.RegistrationRepository;
import com.places.details.Beautiful.places.of.Rathnapura.model.ImageModel;
import com.places.details.Beautiful.places.of.Rathnapura.model.PlacesModel;
import com.places.details.Beautiful.places.of.Rathnapura.model.RegistrationModel;

@Controller
public class AppController {
	
	@Autowired
	ImageService imageService;
	
	@Autowired
	PlacesService placesService;
	
	@Autowired
	PlacesRepository placesRepository;
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	@Autowired
	CheckingUserValidation checkingUserValidation;

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
						
			if(detailsList.get(index).getTopic().toLowerCase().contains(name.toLowerCase())) {
				PlacesModel placesModel = detailsList.get(index);
				model.addAttribute("details", placesModel);
				return "details";
			}
		}
		
		model.addAttribute("errorMessageHeader", "Sorry!!");
		model.addAttribute("errorMessage", "Can not find this location!!");
		return "details";
	}
	
	@RequestMapping(value = "/guideHelp", method = RequestMethod.GET)
	public String registerAgency() {
		return "registration";
	}
	
	@RequestMapping(value = "/guideHelp", method = RequestMethod.POST)
	public String saveData(@RequestParam String fname, @RequestParam String lname, @RequestParam String id, @RequestParam String address,
			@RequestParam String d_of_reser, @RequestParam int team, @RequestParam int mob_num,@RequestParam String password, @RequestParam String email, @RequestParam int pack, Model model) {
		registrationRepository.save(new RegistrationModel(id,fname,lname,address,d_of_reser,team,mob_num,password,email,pack));
		model.addAttribute("successMessage", "Successfully!! Your data was recorded!!");
		return "registration";
	}
	@RequestMapping("/thingsToDo")
	public String seePackage() {
		return "packages";
	}
	
	@RequestMapping(value = "/checkOwnDetails", method=RequestMethod.GET)
	public String checkOwnDetails() {
		return "check_details";
	}
	
	@RequestMapping(value = "/checkOwnDetails", method=RequestMethod.POST)
	public String checkingOwnDetails(@RequestParam String first_name, @RequestParam String password, Model model) {
		
		if(checkingUserValidation.isUservslid(first_name, password) == null) {
			model.addAttribute("errorMessage", "Invlid Inputs! Check your Username and Password again!!");
			return "check_details";
		}
		
		RegistrationModel mod = checkingUserValidation.isUservslid(first_name, password);
		
		model.addAttribute("firstName", mod.getFirst_name());
		model.addAttribute("lastName", mod.getLast_name());
		model.addAttribute("national_id", mod.getNational_id());
		model.addAttribute("address", mod.getAddress());
		model.addAttribute("date_res", mod.getDate());
		model.addAttribute("num_of_team", mod.getNum_of_team());
		model.addAttribute("mob_num", mod.getMobile());
		model.addAttribute("password", mod.getPassword());
		model.addAttribute("email", mod.getEmail());
		model.addAttribute("package_num", mod.getPackage_num());
		
		return "registration";
	}
	
}
