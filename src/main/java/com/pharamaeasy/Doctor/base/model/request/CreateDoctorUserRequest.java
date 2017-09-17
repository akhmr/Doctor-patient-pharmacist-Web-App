package com.pharamaeasy.Doctor.base.model.request;

import com.pharamaeasy.common.base.model.ApiRequest;

/**
 * 
 * @author arvind
 *
 */
public class CreateDoctorUserRequest extends ApiRequest {

	private static final long serialVersionUID = 6743131699761690459L;

	private String mobile;

	private String email;

	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateDoctorUserRequest [mobile=").append(mobile).append(", email=").append(email)
				.append(", password=").append(password).append("]");
		return builder.toString();
	}

}
