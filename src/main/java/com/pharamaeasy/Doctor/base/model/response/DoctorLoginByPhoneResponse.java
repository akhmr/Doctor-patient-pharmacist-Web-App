package com.pharamaeasy.Doctor.base.model.response;

import com.pharamaeasy.Doctor.base.model.DoctorDetail;
import com.pharamaeasy.common.base.model.ApiResponse;

/**
 * 
 * @author arvind
 *
 */
public class DoctorLoginByPhoneResponse extends ApiResponse {
	private static final long serialVersionUID = 8943710948804978215L;

	private DoctorDetail doctorDetail;

	public DoctorDetail getDoctorDetail() {
		return doctorDetail;
	}

	public void setDoctorDetail(DoctorDetail doctorDetail) {
		this.doctorDetail = doctorDetail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoctorLoginByPhoneResponse [doctorDetail=").append(doctorDetail).append("]");
		return builder.toString();
	}

}
