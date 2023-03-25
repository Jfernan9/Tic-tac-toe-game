package Labs;

public class BitwiseOperatorsDemo {
    public static void main(String[] args)
    {
        int x = 58; // 111010
        int y = 13; //1101
        System.out.println("x & y : " + (x & y)); // return 8 = 100
        System.out.println("x | y : " + (x | y)); // 63= 1111111
        System.out.println("x ^ y : " + (x ^ y)); // 55=11011
        System.out.println("~x :  " + (~x));
        System.out.println("x << y : " + (x << y));
        System.out.println("x >> y : " + (x >> y));



    }
}
