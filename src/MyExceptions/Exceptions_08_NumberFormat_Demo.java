package MyExceptions;

public class Exceptions_08_NumberFormat_Demo
{
    public static void main(String[] args)
    {
        try {
            // "akki" os mpt a number
            int num = Integer.parseInt("akki");

            System.out.println(num);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number format exception");

        }

    }
}
