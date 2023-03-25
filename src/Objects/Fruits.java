package Objects;

class Apple
{
    String name;
    int age;

    // create a constructor
    Apple(String name, int age)
    {
        this.name = name;
        this.age = age;

    }
    public void RedApple(Apple apple)
    {
        System.out.println("My Favorite fruit is " + name + "Number of fruit that I eat in a day" + age);

    }

}

public class Fruits
{
    public static void main(String[] args)
    {
        Apple apple = new Apple("Red Apple",5);
        apple.RedApple(apple);

    }

}
