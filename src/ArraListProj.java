import java.util.ArrayList;

public class ArraListProj {
    public static void main(String[] args){

        String[] fruits = new String[4];
                fruits[0] = "Mango";
                fruits[1] = "Apple";
                fruits[2] = "Strawberry";
                fruits[3] = "Watermelon";
                System.out.println(fruits);

                ArrayList fruitsList = new ArrayList();
                fruitsList.add("Mango");
                fruitsList.add("Apple");
                fruitsList.add("Strawberry");
                fruitsList.add("Watermelon");
                fruitsList.remove("Strawberry");
                System.out.println(fruitsList);

    }

}
