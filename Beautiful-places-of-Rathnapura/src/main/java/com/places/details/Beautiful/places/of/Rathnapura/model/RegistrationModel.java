package com.places.details.Beautiful.places.of.Rathnapura.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class RegistrationModel {

	@Id
	private int national_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="num_of_team")
	private int num_of_team;
	
	@Column(name="mobile")
	private int mobile;
	
	@Column(name="email")
	private String email;
	
	@Column(name="package_num")
	private int package_num;
	
	public RegistrationModel() {
		
	}

	public RegistrationModel(int national_id, String first_name, String last_name, String address, Date date,
			int num_of_team, int mobile, String email, int package_num) {
		super();
		this.national_id = national_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.date = date;
		this.num_of_team = num_of_team;
		this.mobile = mobile;
		this.email = email;
		this.package_num = package_num;
	}

	public int getNational_id() {
		return national_id;
	}

	public void setNational_id(int national_id) {
		this.national_id = national_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNum_of_team() {
		return num_of_team;
	}

	public void setNum_of_team(int num_of_team) {
		this.num_of_team = num_of_team;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPackage_num() {
		return package_num;
	}

	public void setPackage_num(int package_num) {
		this.package_num = package_num;
	}
	
}