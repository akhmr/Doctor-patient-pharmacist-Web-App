package com.pharamaeasy.Doctor.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharamaeasy.Doctor.core.entity.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, String> {

}
