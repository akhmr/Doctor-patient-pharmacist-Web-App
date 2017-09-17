package com.pharamaeasy.Doctor.base.model.response;

import com.pharamaeasy.common.base.model.ApiResponse;
/**
 * 
 * @author arvind
 *
 */
public class CreateDoctorUserResponse extends ApiResponse{

	private static final long serialVersionUID = -5606550280793387686L;
	
	private boolean created;

	public boolean isCreated() {
		return created;
	}

	public void setCreated(boolean created) {
		this.created = created;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateDoctorUserResponse [created=").append(created).append("]");
		return builder.toString();
	}
	
}
