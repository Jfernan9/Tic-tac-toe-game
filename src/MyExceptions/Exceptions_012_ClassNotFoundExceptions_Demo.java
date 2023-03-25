package MyExceptions;

public class Exceptions_012_ClassNotFoundExceptions_Demo
{
    public static void main(String[] args)
    {
        try {
            Class.forName("Class1");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
            System.out.println("Class 1 Not Found..");

        }

    }
}
