package cse.basic.lld;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital implements Procedure{
    private static Hospital hospital = new Hospital();

    public static Hospital getHospital(){
        return hospital;
    }

    // storage
    private List<OutPatient> myPatients = new ArrayList<>();

    private Hospital(){
        OutPatient op1= new OutPatient();
        op1.setPatientName("Yuvaraj");op1.setPatientAge(36);
        op1.setPatientHeight(189.0);op1.setPatientWeight(76.9);
        OutPatient op2=new OutPatient("Kannan",89,156,45);
        myPatients.add(op1);myPatients.add(op2);
    }

    // operations
    @Override
    public void register(OutPatient outPatient) {
        // TODO Auto-generated method stub
        double meter = outPatient.getPatientHeight()/100;
        outPatient.setBmi(outPatient.getPatientWeight()/(meter*meter));
        myPatients.add(outPatient);
        System.out.println(outPatient.getPatientName()+" has been resgitered");
    }

    @Override
    public List<OutPatient> viewPatients() {
        // TODO Auto-generated method stub
        return myPatients;
    }

    @Override
    public List<OutPatient> viewObese() {
        // TODO Auto-generated method stub
        return myPatients.stream().filter(pat->{
            return pat.getBmi()>=35.1;
        }).collect(Collectors.toList());
    }
}
