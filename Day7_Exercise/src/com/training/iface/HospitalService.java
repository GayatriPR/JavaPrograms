package com.training.iface;

import java.util.ArrayList;
import java.util.HashMap;


import com.training.Doctor;
import com.training.Patient;

public interface HospitalService {

		boolean cancelAppointment(Patient patient,HashMap<Doctor,Patient> appointment);
		
	    public HashMap<Doctor, Patient> addAppointment(Doctor doctor, Patient patient);
		
	    public Patient getPatientList(Doctor doctor); 

	
}

