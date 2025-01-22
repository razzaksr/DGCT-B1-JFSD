package cse.basic.lld;

public class OutPatient {
    private String patientName;
    private int patientAge;
    private double patientHeight;
    private double patientWeight;
    private double bmi;
    public void setPatientName(String patientName){
        this.patientName=patientName;
    }
    public String getPatientName(){
        return patientName;
    }
    public int getPatientAge() {
        return patientAge;
    }
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }
    public double getPatientHeight() {
        return patientHeight;
    }
    public void setPatientHeight(double patientHeight) {
        this.patientHeight = patientHeight;
    }
    public double getPatientWeight() {
        return patientWeight;
    }
    public void setPatientWeight(double patientWeight) {
        this.patientWeight = patientWeight;
    }
    public double getBmi() {
        return bmi;
    }
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    @Override
    public String toString() {
        return "OutPatient [patientName=" + patientName + ", patientAge=" + patientAge + ", patientHeight="
                + patientHeight + ", patientWeight=" + patientWeight + ", bmi=" + bmi + "]";
    }
    // default cons
    public OutPatient(){}
    public OutPatient(String patientName, int patientAge, double patientHeight, double patientWeight) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientHeight = patientHeight;
        this.patientWeight = patientWeight;
    }
}
// class Access{
//     public static void main(String[] args) {
//         OutPatient op1= new OutPatient();
//         //op1.patientName="Yuvaraj";
//         op1.setPatientName("Yuvaraj");op1.setPatientAge(36);
//         op1.setPatientHeight(189.0);op1.setPatientWeight(76.9);
//         System.out.println(op1);
//         OutPatient op2=new OutPatient("Kannan",89,156,45);
//         System.out.println(op2.getPatientName()+" "+op2.getPatientAge());
//     }
// }