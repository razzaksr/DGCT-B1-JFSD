package cse.basic;

import java.util.Scanner;

public class ArrCrud {
    // create
    public static void getInformation(double[] employees){
        Scanner scanner = new Scanner(System.in);
        for(int index=0;index<employees.length;index++){
            System.out.println("Enter the salary of "+(index+1));
            employees[index]=scanner.nextDouble();
        }
        scanner.close();
    }
    public static void taxDeduction(double[] arr){
        for(int position=0;position<arr.length;position++){
            if(arr[position]>=30.1){
                arr[position]-=(arr[position]*0.300);
            }
            else if(arr[position]>=3.1&&arr[position]<=5.0){
                arr[position]-=(arr[position]*0.050);
            }
            else if(arr[position]>=5.1&&arr[position]<=15.0){
                arr[position]-=(arr[position]*0.100);
            }
            else if(arr[position]>=15.1&&arr[position]<=25.0){
                arr[position]-=(arr[position]*0.200);
            }
        }
    }
    public static void main(String[] args) {
        // double[] empAnnualIncome = new double[10];
        // ArrCrud.getInformation(empAnnualIncome);
        double[] empAnnualIncome = {25.6,12.8,98.5,45.6,11.5,9.2,10.5};

        // read
        for(double each:empAnnualIncome){System.out.print(each+" ");}

        ArrCrud.taxDeduction(empAnnualIncome);
        System.out.println();

        // read
        for(double each:empAnnualIncome){System.out.print(each+" ");}

    }
}
