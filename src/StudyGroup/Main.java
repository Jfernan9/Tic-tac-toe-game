package StudyGroup;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> animals = new ArrayList<>();
        // adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        // removing elements
        animals.remove("Dog");
        // printing statement
        animals.add("Snake");
        System.out.println("ArrayList: " + animals);

    }
}
