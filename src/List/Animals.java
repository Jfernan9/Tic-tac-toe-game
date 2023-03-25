package List;

import java.util.LinkedList;

public class Animals
{
    public static void main(String[] args)
    {
        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();
        // add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("cow");
        System.out.println("LinkedList:" + animals);

        // add additional animals
        animals.add(1,"Horse");
        System.out.println("Updated LinkedList:" + animals);


        // Get the elements of updated linkedlist
        String str = animals.get(1);
        System.out.println("Element at index 1:" + str);


    }
}
