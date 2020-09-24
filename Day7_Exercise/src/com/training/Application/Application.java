package com.training.Application;

import java.util.*;

import com.training.Doctor;
import com.training.HospitalServiceImp;
import com.training.Patient;
import com.training.iface.HospitalService;


public class Application {

	public static void main(String[] args) {
	
        HospitalService sahyadri = new HospitalServiceImp();
        HashMap<Doctor, Patient> appointments= new HashMap<Doctor, Patient>();
		
		Doctor Raj=new Doctor(20,"Ram");
		Doctor Gayatri=new Doctor(30, "Gayatri");
		
		
		Patient Ramesh=new Patient(100,"Ramesh");
		Patient Shyam=new Patient(200,"Shyam");
		Patient Krishna=new Patient(300,"Krishna");
		Patient suresh=new Patient(400,"suresh");
        
		appointments= sahyadri.addAppointment(Raj, Krishna);
		appointments= sahyadri.addAppointment(Gayatri, Shyam);


        System.out.println("The Patient List of doctor is: ");
		System.out.println(sahyadri.getPatientList(Gayatri));
		
        appointments= sahyadri.addAppointment(Gayatri, suresh);
		System.out.println(appointments); 

	
		if(sahyadri.cancelAppointment(suresh,appointments))
		{
			System.out.println("The Appointment list is:  ");
			System.out.println(appointments);	
		}
		else
		{
			System.out.println("No such Appointment is Available..");
		}

		
      
		
		
		


		
	}

}
