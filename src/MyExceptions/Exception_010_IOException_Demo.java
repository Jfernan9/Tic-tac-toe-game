package MyExceptions;

import java.util.Scanner;

public class Exception_010_IOException_Demo
{
    public static void main(String[] args)
    {
        // create a new scanner with the specified string
        // object
        Scanner scan = new Scanner("Hello Geek!");

        // Print the Line
        System.out.println("" + scan.nextLine());

        // Check if there is an IO exception
        System.out.println("Exception output: "+ scan.ioException());

        scan.close();

    }
}
