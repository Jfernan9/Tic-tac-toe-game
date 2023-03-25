package Set;
import java.util.HashSet;

public class Numbers
{
    public static void main(String[] args)
    {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet:" + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);


    }
}
