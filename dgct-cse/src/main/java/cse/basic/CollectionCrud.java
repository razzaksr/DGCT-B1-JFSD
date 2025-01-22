package cse.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionCrud {
    public static void main(String[] args) {
        // ArrayList myEmployees = new ArrayList<>();// non generic
        ArrayList<Double> myEmployees = new ArrayList<>();// generic
        // myEmployees.add(25.6);myEmployees.add(78.9);
        // myEmployees.add(3.5);myEmployees.add(7.4);
        myEmployees = (ArrayList<Double>)Stream.of(34.5,9.2,12.5,1.8,2.5).collect(Collectors.toList());
        System.out.println(myEmployees);
        System.out.println(myEmployees.get(1));
        System.out.println(myEmployees.contains(9.2));
        System.out.println(myEmployees.indexOf(1.8));
        myEmployees.set(3, 7.4);
        System.out.println(myEmployees);
        myEmployees.remove(1.8);
        myEmployees.remove(2);
        System.out.println(myEmployees);
        List<Laptop> myStock = new ArrayList<>();// factory
        Laptop laptop1 = new Laptop();laptop1.model="Dell Vostro";laptop1.price=33500.5;
        Laptop laptop2 = new Laptop();laptop2.model="Lenevo ThnkPad";laptop2.price=56007.5;
        Laptop laptop3 = new Laptop();laptop3.model="HP Pavilion";laptop3.price=92700.4;
        Laptop laptop4 = new Laptop();laptop4.model="Asus Gamezone";laptop4.price=98112.5;
        // myStock.add(laptop1);myStock.add(laptop2);myStock.add(laptop3);
        // myStock.add(laptop4);
        // System.out.println(myStock);
        System.out.println(laptop1);
    }
}

class Laptop{
    String model;
    double price;
    public String toString(){
        return model+" : "+price+"\n";
    }
}
