package myArraysOfArrays;

import java.util.ArrayList;

public class OnlineShopping {
    public static void main(String[] args) {
        ArrayList<String> OnlineShopping = new ArrayList<String>();
        OnlineShopping.add("Socks"); OnlineShopping.add("Hat"); OnlineShopping.add("Shirt");
        int choice =  2;
        switch (choice){
            case 1:
                OnlineShopping.add("Jeans");
                System.out.println(OnlineShopping);
                //
                break;
            case 2:
                OnlineShopping.remove(1);
                System.out.println(OnlineShopping);
                //
                break;
            case 3:
                System.out.println(OnlineShopping.size());

                //
                break;
            case 4:
                for (String i: OnlineShopping ) {
                    System.out.println((i));
                }
                //
                break;
            default:
                System.out.println("Select another option");



        }
    }
}
