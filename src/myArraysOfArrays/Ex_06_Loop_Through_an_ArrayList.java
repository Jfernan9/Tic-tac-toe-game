package myArraysOfArrays;

import java.util.ArrayList;

public class Ex_06_Loop_Through_an_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars .size (); i++) {
            System.out.println(cars.get(i));
        }

    }
}
