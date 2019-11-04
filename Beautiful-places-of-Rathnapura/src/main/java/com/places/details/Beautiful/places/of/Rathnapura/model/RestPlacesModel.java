package com.places.details.Beautiful.places.of.Rathnapura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="places_to_stay")
public class RestPlacesModel {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="image")
	private String image;
	
	@Column(name="title")
	private String title;
	
	@Column(name="link")
	private String link;
	
	@Column(name="information")
	private String information;
	
	public RestPlacesModel() {
		
	}

	public RestPlacesModel(int id, String image, String title, String link, String information) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.link = link;
		this.information = information;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
}
