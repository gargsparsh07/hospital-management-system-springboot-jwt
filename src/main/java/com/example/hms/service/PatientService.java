package com.example.hms.service;

import com.example.hms.dto.PatientDto;
import com.example.hms.entity.Patient;
import com.example.hms.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient createPatient(PatientDto dto) {
        Patient patient = Patient.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .gender(dto.getGender())
                .disease(dto.getDisease())
                .address(dto.getAddress())
                .phoneNumber(dto.getPhoneNumber())
                .build();
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow();
    }

    public Patient updatePatient(Long id, PatientDto dto) {
        Patient patient = patientRepository.findById(id).orElseThrow();
        patient.setName(dto.getName());
        patient.setAge(dto.getAge());
        patient.setGender(dto.getGender());
        patient.setDisease(dto.getDisease());
        patient.setAddress(dto.getAddress());
        patient.setPhoneNumber(dto.getPhoneNumber());
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}