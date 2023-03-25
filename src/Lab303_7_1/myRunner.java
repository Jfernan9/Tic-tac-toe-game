package Lab303_7_1;

public class myRunner
{
    public static void main(String[] args)
    // initialize the class with Integer data
    {
        DemoClass dobj = new DemoClass();
        dobj.genericsMethod(25); // Passing int
        dobj.genericsMethod("Per Scholas"); // passing String
        dobj.genericsMethod(2563.5); // passing a float
        dobj.genericsMethod('H'); // passing a Char

    }
}
