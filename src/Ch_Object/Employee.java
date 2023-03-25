package Ch_Object;

public class Employee
{
    String name;
    int age;
    String designation;
    double salary;

    // This is the constructor of the class Employee
    public Employee(String name)
    {
        this.name = name;
    }


    // Assigned the age of the Employee to the variable age.
    public void empAge(int empAge)
    {
        age = empAge;
    }
    /*assigned the designation to the variable designation.*/
    public void empDesignation(String empDesig)

    {
        designation = empDesig;

    }
    // assign the salary to the variable salary

    public void empSalary(double empSalary)
    {
        salary = empSalary;


    }
    // print the employee details
    public void printEmployee()
    {
        System.out.print("Name:" + name);
        System.out.print(" Age: " + name);
        System.out.print("Designation:" + designation );
        System.out.println("Salary:" + salary);



    }


}