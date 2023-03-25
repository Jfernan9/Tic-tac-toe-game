package myArraysOfArrays;

import java.util.ArrayList;

public class Ex_07_Loop_Through_an_ArrayList_For_Each {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i: cars ) {
        System.out.println();
        }
    }
}
