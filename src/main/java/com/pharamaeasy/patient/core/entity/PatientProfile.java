package com.pharamaeasy.patient.core.entity;

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


@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "code" }) )
public class PatientProfile implements Serializable {

	private static final long serialVersionUID = -6894955019750517637L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn(name = "code")
	private Patient patient;
	@Column(length = 100)
	private String name;
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Gender gender;
	@Column(length = 100)
	private String location;
	@Column(length = 100)
	private String image;

	public PatientProfile() {
		super();
	}

	public enum Gender {
		MALE, FEMALE;

		public static Gender getGenderByName(String genderStr) {
			Gender gender = null;
			for (Gender genderEnum : Gender.values()) {
				if (genderEnum.name().equals(genderStr)) {
					gender = genderEnum;
					break;
				}
			}
			return gender;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientProfile [id=").append(id).append(", patient=").append(patient).append(", name=")
				.append(name).append(", gender=").append(gender).append(", location=").append(location)
				.append(", image=").append(image).append("]");
		return builder.toString();
	}

}
