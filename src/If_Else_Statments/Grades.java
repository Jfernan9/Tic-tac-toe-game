package If_Else_Statments;

import java.util.Scanner;

public class Grades
{
    public static void main(String[] args)
    {
        // Making a Scanner add System.in
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade: ");

        int n = scan.nextInt();

        if(n>=90 && n <=100)
        {
            System.out.println("A");
        } else if (n >= 80 && n<=90 )
        {
            System.out.println("B");

        } else if (n >=70 && n<=80)
        {
            System.out.println("C");

        } else if (n >=60 && n<=69 )
        {
            System.out.println("D");

        } else if (n >=69 && n<=50)
        {
            System.out.println("F");

        }
        else
        {
            System.out.println("The number you entered is not in the range. ");
        }

    }
}
