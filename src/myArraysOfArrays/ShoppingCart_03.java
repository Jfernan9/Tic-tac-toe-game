package myArraysOfArrays;

import java.util.ArrayList;

public class ShoppingCart_03 {
    public static void main(String[] args) {
        ArrayList<String> ShoppingCart = new ArrayList<String>();
        ShoppingCart.add("Jeans");
        ShoppingCart.add("T-shirt");
        ShoppingCart.add("Shoes");
        ShoppingCart.add("Socks");
        ShoppingCart.set( 0,"Jeans");
        ShoppingCart.remove(1);

        System.out.println(ShoppingCart.get(1));
    }
}
