package com.places.details.Beautiful.places.of.Rathnapura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="places")
public class ImageModel {

	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="pic")
	private String pic;
	
	public ImageModel() {
		
	}
	
	public ImageModel(int id, String name, String type, String pic) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.pic = pic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
}
