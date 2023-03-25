package myArrayOfObjects;

// creat a student Class with
// id and name as a atrributes
public class Student {

    public int id;
    public String name;

    // student class constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //display() method to display
    // the student data
    public void display()
    {
        System.out.println("Student id is: " + id + " " + "and Student name is : " + name);
        System.out.println();


    }
}

