package Lab303_7_1;

public class DemoClass
{
    // Create a generics method
    public <T> void genericsMethod(T data)
    {
        System.out.println("Generics Method:");
        System.out.println("Data Passed:" + data);
    }
}
