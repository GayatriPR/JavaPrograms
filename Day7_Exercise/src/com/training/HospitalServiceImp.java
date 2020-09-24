package com.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.training.iface.HospitalService;

public class HospitalServiceImp implements HospitalService {

	
	private ArrayList<Doctor> docList;
	private ArrayList<Patient> patientList;

	HashMap<Doctor,Patient> appointments = new HashMap<Doctor,Patient>();

	
	@Override
	public HashMap<Doctor, Patient> addAppointment(Doctor doctor, Patient patient) {
		
			appointments.put(doctor, patient);
		
		return appointments;
	}

	@Override
	public Patient getPatientList(Doctor doctor) {
		
		return appointments.get(doctor);
	}

	@Override
	public boolean cancelAppointment(Patient patient,HashMap<Doctor, Patient> appointments) {
		return appointments.values().remove(patient);
	        
	}
	
	}

