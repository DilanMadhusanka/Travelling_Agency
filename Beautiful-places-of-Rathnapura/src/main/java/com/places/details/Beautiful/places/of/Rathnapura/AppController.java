package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.places.details.Beautiful.places.of.Rathnapura.model.ImageModel;

@Controller
public class AppController {
	
	@Autowired
	ImageService imageService;

	@RequestMapping("/locations")
	public String showLocations(Model model) {
		List<ImageModel> contactList = imageService.getContactList();
		model.addAttribute("contacts", contactList);
		return "locations";
	}
}
