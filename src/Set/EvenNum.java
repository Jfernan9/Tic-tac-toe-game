package Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;


public class EvenNum
{
    public static void main(String[] args)
    // creating an arrayList of even numbers
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("ArrayList: " + evenNumbers);

        // creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> number = new LinkedHashSet<>(evenNumbers);
        System.out.println("LinkedHashSet:"+ number);


    }
}
