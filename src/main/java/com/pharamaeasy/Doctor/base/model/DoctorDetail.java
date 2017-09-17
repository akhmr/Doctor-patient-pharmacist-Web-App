package com.pharamaeasy.Doctor.base.model;

import java.io.Serializable;

public class DoctorDetail implements Serializable{
	
	private static final long serialVersionUID = -1969009600802558257L;
	
	private String code;
	
	private String mobile;
	
	private String email;
	
	private DoctorProfileDetail doctorProfile;

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
	
	public DoctorProfileDetail getDoctorProfile() {
		return doctorProfile;
	}

	public void setDoctorProfile(DoctorProfileDetail doctorProfile) {
		this.doctorProfile = doctorProfile;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoctorDetail [code=").append(code).append(", mobile=").append(mobile).append(", email=")
				.append(email).append(", doctorProfile=").append(doctorProfile).append("]");
		return builder.toString();
	}

}
