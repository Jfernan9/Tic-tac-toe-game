package MyExceptions;

public class Exceptions_03_Throw
{
    static void checkAge(int age)
    {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");

        }
        else
        {
            System.out.println("Access granted - you are old enough!");
        }

    }

    public static void main(String[] args)
    {
        checkAge(18); // Set age to 15 (Which is below 18...)

    }
}
