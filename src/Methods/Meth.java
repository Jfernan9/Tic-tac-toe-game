package Methods;

public class Meth
{
    public static void main(String[] args)
    {

       Welcome();
       multiply(5,100);
       multiply(7,15);
       multiply(11,8);
       divide(20,5);
       divide(10,2);
       divide(144,12);



    }
    public static void Welcome(){
        System.out.println("Welcome to out calculator");
    }
    // creating a method
    public static void multiply(int a, int b) {
        System.out.println(a*b);


    }
    public static void divide(int a, int b){
        System.out.println(a/b);
    }


}
