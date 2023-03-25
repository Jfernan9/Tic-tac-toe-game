package myArrayOfObjects;

import java.util.ArrayList;

public class PersonImpl
{
    public static void main(String [] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // a person object can be created first
        Person john = new Person("John");
        //and then added to the list
        persons.add(john);

        // persons object can also be created in the same sentence that they are added to the list
        persons.add(new Person("Mathew"));
        persons.add(new Person("Martin"));

        for (Person person : persons) {
            System.out.println(person);


        }
    }

}
