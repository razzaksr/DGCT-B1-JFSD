package cse.basic;

public class Builder {
    public static void main(String args) {   System.out.println("Simple string"); }
    public static void main() { System.out.println("No param");   }
    public static void main(int alpha) { System.out.println("receoived "+alpha);  }
    public static void main(String[] inputs) {
        System.out.println("Career opportunities in Accounts");
        // double height = Double.parseDouble(inputs[0]);
        // double weight = Double.parseDouble(inputs[1]);
        // height/=100;
        // double bmi = weight/(height*height);
        // System.out.println("Your bmi "+bmi);
        main();
        main(89);
        main("Razak Mohamed");
    }
    
}

class Simulation{
    public static void main(String[] args) {
        System.out.println("Career opportunities in Catia");
        //Builder.main(args);
    }
}
