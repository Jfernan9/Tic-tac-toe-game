package Maps;
import java.util.TreeMap;

public class Numbers
{
    public static void main(String[] args)
    {
        TreeMap<String, Integer> evennumbers = new TreeMap<>();
        // using put()
        evennumbers.put("Two",2);
        evennumbers.put("Four",4);

        // using put if absent
        evennumbers.putIfAbsent("six",6);
        System.out.println("Tree map of even numbers:" + evennumbers);

        //creating treemap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("one",1);
        //using putall()
        numbers.putAll(evennumbers);
        System.out.println("TreeMap of numbers:" + numbers);




    }


}
