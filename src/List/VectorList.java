package List;

import java.util.Vector;

public class VectorList
{
    public static void main(String[] args)
    {
        Vector<String> family = new Vector<>();
        family.add(0,"King" );
        family.add("Queen");
        family.add("John");

        Vector<Integer> age = new Vector<>();
        age.add(10);
        age.add(5);
        age.add(9);

        System.out.println("my name is" + family + age );

    }

}
