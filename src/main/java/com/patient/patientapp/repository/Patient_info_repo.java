package com.patient.patientapp.repository;

import com.patient.patientapp.entity.Patient_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Patient_info_repo extends JpaRepository<Patient_info,String> {

    @Query(value = "SELECT * FROM patient_info",nativeQuery = true)
    public List<Patient_info> all();
}
