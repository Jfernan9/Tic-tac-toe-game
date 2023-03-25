package myArraysOfArrays;

import java.util.ArrayList;

public class Ex_04_Remove_an_Item {
    public static <Arraylist> void main(String[] args) {
        ArrayList<String> ShoppingCart = new ArrayList<String>();

        ShoppingCart.add("Jeans");
        ShoppingCart.add("T-shirt");
        ShoppingCart.add("Shoes");
        ShoppingCart.add("Socks");
        String jesus = ShoppingCart.toString();
        System.out.println(jesus);
        ShoppingCart.remove(2);
        jesus = ShoppingCart.toString();
        System.out.println(jesus);

    }
}
