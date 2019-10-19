package com.places.details.Beautiful.places.of.Rathnapura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.details.Beautiful.places.of.Rathnapura.jpa.ImageRepository;
import com.places.details.Beautiful.places.of.Rathnapura.model.ImageModel;

@Service
public class ImageService {
	
	@Autowired
	ImageRepository imageRepository;

	public List<ImageModel> getContactList() {
		List<ImageModel> list = new ArrayList<>();
		
		for (ImageModel imageModel : imageRepository.findAll()) {
			list.add(imageModel);
		}
		
		return list;
	}
}
