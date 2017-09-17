package com.pharamaeasy.Doctor.base.model.request;

import com.pharamaeasy.common.base.model.ApiRequest;

public class DoctorLoginByPhoneRequest extends  ApiRequest{
	
	private static final long serialVersionUID = 3954554086712887958L;

	private String phone;
	
	private String password;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
		builder.append("DoctorLoginByPhoneRequest [phone=").append(phone).append(", password=").append(password)
				.append("]");
		return builder.toString();
	}

}
