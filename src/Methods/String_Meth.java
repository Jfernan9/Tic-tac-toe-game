package Methods;

public class String_Meth
{
    public static void main(String[] args)
    {
        // String Method
        String name = "Billy Bob Joe";
        System.out.println("Name:" + name);
        System.out.println("UpperCase:" + name.toUpperCase());
        System.out.println("Lowercase:"+name.toLowerCase());
        String name2 = "Jesus.";
        System.out.println("Name:"+ name2);
        System.out.println("Uppercase:"+ name2.toUpperCase());
        System.out.println("First char:" + name.charAt(1));
        System.out.println("Length:"+name2.length());
        System.out.println("Length:" +name.length());
        System.out.println("Substring:" + name.substring(10,13));


    }

}
