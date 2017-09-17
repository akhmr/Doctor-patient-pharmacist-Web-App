package com.pharamaeasy.Doctor.base.model;

import java.io.Serializable;

import com.pharamaeasy.patient.core.entity.PatientProfile.Gender;

public class DoctorProfileDetail implements Serializable{
	
	private static final long serialVersionUID = -5976205150174765756L;

	private String name;
	
	private Gender gender;
	
	private String location;
	
	private String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoctorProfileDetail [name=").append(name).append(", gender=").append(gender)
				.append(", location=").append(location).append(", image=").append(image).append("]");
		return builder.toString();
	}
	
}
