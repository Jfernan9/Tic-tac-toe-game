package Ch_Object;

public class Person {
    private final String name;
    private int age ;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name ){
        this.name = name;
        this.age = 0;
        this.weight =0;
        this.height = 0;

    }



    public String getName() {
        return this.name;


    }
    public int getAge(){
        return this.age;

    }
    public void growOlder() {
        this.age = this. age+ 1;

    }
    public void setHigh(int newHeight){
        this.height = newHeight;

    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;

    }

    @Override
    public String toString() {
        return (this.name+", age" + this.age + "years");
    }
}
