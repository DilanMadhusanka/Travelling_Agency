package com.places.details.Beautiful.places.of.Rathnapura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nanperial")
public class PlacesModel {

	@Id
	private int id;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="picture")
	private String picture;
	
	@Column(name="description")
	private String description;
	
	public PlacesModel() {
		
	}

	public PlacesModel(int id, String topic, String picture, String description) {
		super();
		this.id = id;
		this.topic = topic;
		this.picture = picture;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
