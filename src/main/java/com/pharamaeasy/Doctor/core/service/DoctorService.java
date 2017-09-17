package com.pharamaeasy.Doctor.core.service;

import java.util.List;

import com.pharamaeasy.Doctor.base.model.DoctorDetail;
import com.pharamaeasy.Doctor.base.model.request.CreateDoctorUserRequest;
import com.pharamaeasy.Doctor.base.model.response.CreateDoctorUserResponse;

public interface DoctorService {
	
	public CreateDoctorUserResponse createDoctorUser(CreateDoctorUserRequest request);
	
	public DoctorDetail loginByEmail();
	
	public DoctorDetail loginByPhone();
	
	public List<DoctorDetail> getDoctors(List<String> doctorsIds);

}
