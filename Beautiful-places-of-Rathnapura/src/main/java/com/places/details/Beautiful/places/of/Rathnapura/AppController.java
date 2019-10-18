package com.places.details.Beautiful.places.of.Rathnapura;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/locations")
	public String showLocations() {
		return "locations";
	}
}
