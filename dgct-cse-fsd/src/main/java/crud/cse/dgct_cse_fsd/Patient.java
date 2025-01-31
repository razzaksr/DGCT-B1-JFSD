package crud.cse.dgct_cse_fsd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
    @Id
    private int patientId;
    private String patientName;
    private int patientAge;
    private double patientWeight;
    private double patientHeight;
    private double patientBmi;
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getPatientAge() {
        return patientAge;
    }
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }
    public double getPatientWeight() {
        return patientWeight;
    }
    public void setPatientWeight(double patientWeight) {
        this.patientWeight = patientWeight;
    }
    public double getPatientHeight() {
        return patientHeight;
    }
    public void setPatientHeight(double patientHeight) {
        this.patientHeight = patientHeight;
    }
    public double getPatientBmi() {
        return patientBmi;
    }
    public void setPatientBmi(double patientBmi) {
        this.patientBmi = patientBmi;
    }
}
