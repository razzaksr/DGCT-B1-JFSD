package crud.cse.dgct_cse_fsd;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
    // data logic/ storage
    private List<Patient> myPatients = new ArrayList<>();
    public PatientRepository(){
        Patient patient = new Patient();
        patient.setPatientId(11);
        patient.setPatientName("Vinayak");
        patient.setPatientAge(45);
        patient.setPatientBmi(34.6);
        patient.setPatientHeight(176);
        patient.setPatientWeight(82);
        myPatients.add(patient);
        patient = new Patient();
        patient.setPatientId(8);
        patient.setPatientName("Suman");
        patient.setPatientAge(39);
        patient.setPatientBmi(24.1);
        patient.setPatientHeight(186);
        patient.setPatientWeight(75);
        myPatients.add(patient);
        patient = new Patient();
        patient.setPatientId(90);
        patient.setPatientName("Victor");
        patient.setPatientAge(27);
        patient.setPatientBmi(21.9);
        patient.setPatientHeight(186);
        patient.setPatientWeight(72);
        myPatients.add(patient);
        patient = new Patient();
        patient.setPatientId(4);
        patient.setPatientName("Mahadev");
        patient.setPatientAge(66);
        patient.setPatientBmi(29.6);
        patient.setPatientHeight(196);
        patient.setPatientWeight(88);
        myPatients.add(patient);
    }

    // operations
    // register patient
    public Patient save(Patient patient){
        double tempHeight = patient.getPatientHeight();
        double tempWeight = patient.getPatientWeight();
        tempHeight/=100;// cm to m
        patient.setPatientBmi(tempWeight/(tempHeight*tempHeight));
        myPatients.add(patient);
        return patient;
    }
    // view all patients
    public List<Patient> findAll(){
        return myPatients;
    }
    public List<Patient> findAllByObese(){
        return myPatients.stream().filter(each->{
            return each.getPatientBmi()>31.0;
        }).toList();
    }
}
