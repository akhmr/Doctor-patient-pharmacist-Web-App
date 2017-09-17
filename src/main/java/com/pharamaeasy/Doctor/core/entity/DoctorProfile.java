package com.pharamaeasy.Doctor.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.pharamaeasy.patient.core.entity.PatientProfile.Gender;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "code" }) )
public class DoctorProfile implements Serializable{
	
	private static final long serialVersionUID = -6894955019750517637L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn(name = "code")
	private Doctor doctor;
	@Column(length = 100)
	private String name;
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Gender gender;
	@Column(length = 100)
	private String location;
	@Column(length = 100)
	private String image;
	
	public DoctorProfile() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

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
		builder.append("DoctorProfile [id=").append(id).append(", doctor=").append(doctor).append(", name=")
				.append(name).append(", gender=").append(gender).append(", location=").append(location)
				.append(", image=").append(image).append("]");
		return builder.toString();
	}

}
