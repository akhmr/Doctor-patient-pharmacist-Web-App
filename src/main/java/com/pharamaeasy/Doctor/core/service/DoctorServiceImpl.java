package com.pharamaeasy.Doctor.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.pharamaeasy.Doctor.base.model.DoctorDetail;
import com.pharamaeasy.Doctor.base.model.request.CreateDoctorUserRequest;
import com.pharamaeasy.Doctor.base.model.response.CreateDoctorUserResponse;
import com.pharamaeasy.Doctor.core.entity.Doctor;
import com.pharamaeasy.Doctor.core.repo.DoctorRepo;

/**
 * 
 * @author arvind
 *
 */
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	@Transactional
	public CreateDoctorUserResponse createDoctorUser(CreateDoctorUserRequest request) {
		CreateDoctorUserResponse response = validate(request);
		if (response.getStatus() != HttpStatus.OK) {
			return response;
		}

		try {
			Doctor doctor = new Doctor();
			doctor.setEmail(request.getEmail());
			doctor.setMobile(request.getMobile());
			doctor.setPassword(request.getPassword());
			doctorRepo.save(doctor);
			response.setStatus(HttpStatus.OK);
		} catch (Exception e) {
			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			response.setMessage("Server Internal Error");
		}

		return response;
	}

	private CreateDoctorUserResponse validate(CreateDoctorUserRequest request) {
		CreateDoctorUserResponse response = new CreateDoctorUserResponse();

		List<String> errors = new ArrayList<>();

		if (request == null) {
			errors.add("Request cannot be null");
			response.setStatus(HttpStatus.BAD_REQUEST);
			response.setMessage("Validation Errors");
			response.setErrors(errors);
			return response;
		}

		if (StringUtils.isEmpty(request.getEmail())) {
			errors.add("Email cannot be null oe empty ");
		}

		if (StringUtils.isEmpty(request.getMobile())) {
			errors.add("Mobile No cannot be empty or null ");
		}

		if (StringUtils.isEmpty(request.getPassword())) {
			errors.add("Password cannot be empty or null ");
		}

		if (!errors.isEmpty()) {
			response.setStatus(HttpStatus.BAD_REQUEST);
			response.setMessage("Validation Errors");
		} else {
			response.setStatus(HttpStatus.OK);
		}
		return response;
	}

	@Override
	public DoctorDetail loginByEmail() {
		return null;
	}

	@Override
	public DoctorDetail loginByPhone() {
		return null;
	}

	@Override
	public List<DoctorDetail> getDoctors(List<String> doctorsIds) {
		return null;
	}

}
