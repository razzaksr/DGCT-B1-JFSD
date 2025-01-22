package cse.basic.lld;

import java.util.Scanner;

public class Reception {
    public static void main(String[] args) {
        Hospital hospital=Hospital.getHospital();// singleton
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------ABC Hospitals------------------");
        do{
            System.out.println("1.Register OP\n2.View Patients\n3.View Obese\nAny to logout");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("To register OP enter the name, age, height, weight ");
                    OutPatient outPatient = new OutPatient();
                    outPatient.setPatientName(scanner.next());
                    outPatient.setPatientAge(scanner.nextInt());
                    outPatient.setPatientHeight(scanner.nextDouble());
                    outPatient.setPatientWeight(scanner.nextDouble());
                    hospital.register(outPatient);
                    break;
                case 2:System.out.println(hospital.viewPatients());break;
                case 3:System.out.println(hospital.viewObese());break;
                default:
                    return;
            }
        }while(true);
    }
}
