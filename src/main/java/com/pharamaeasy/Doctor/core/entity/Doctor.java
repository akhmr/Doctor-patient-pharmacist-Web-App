package com.pharamaeasy.Doctor.core.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "mobile" }),
		@UniqueConstraint(columnNames = { "email" }) })
public class Doctor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 20)
	private String code;
	@Column(length = 20)
	private String mobile;
	@Column(length = 254)
	private String email;
	private String password;
	@OneToOne(mappedBy = "doctor", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private DoctorProfile doctorProfile;

	public Doctor() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public DoctorProfile getDoctorProfile() {
		return doctorProfile;
	}

	public void setDoctorProfile(DoctorProfile doctorProfile) {
		this.doctorProfile = doctorProfile;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Doctor [code=").append(code).append(", mobile=").append(mobile).append(", email=").append(email)
				.append(", doctorProfile=").append(doctorProfile).append("]");
		return builder.toString();
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


}
