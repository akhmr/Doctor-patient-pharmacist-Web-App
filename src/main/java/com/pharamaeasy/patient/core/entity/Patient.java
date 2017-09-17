package com.pharamaeasy.patient.core.entity;

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
public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 20)
	private String code;
	@Column(length = 20)
	private String mobile;
	@Column(length = 254)
	private String email;
	@OneToOne(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private PatientProfile patientProfile;

	public Patient() {
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
	
	public PatientProfile getPatientProfile() {
		return patientProfile;
	}

	public void setPatientProfile(PatientProfile patientProfile) {
		this.patientProfile = patientProfile;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Patient [code=").append(code).append(", mobile=").append(mobile).append(", email=")
				.append(email).append(", patientProfile=").append(patientProfile).append("]");
		return builder.toString();
	}

}
