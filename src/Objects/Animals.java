package Objects;

class Dog{
    String name;
    int age;

    // created a  constructor
    Dog(String name, int age)
    {
        this. name = name;
        this. age = age;

    }
    // Passing the pramertor as an object
    public void pritDog(Dog dog)
    {
        System.out.println("Name is " + name + " and age is" + age);

    }
}

public class Animals
{
    public static void main(String[] args)
    {
        // we created an object Dog
        Dog dog = new Dog("Fox", 7);
        dog.pritDog(dog);

    }

}
