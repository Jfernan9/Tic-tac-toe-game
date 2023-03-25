package CopyARRAY;

public class ArrayEx_01
{
    public static void main(String[] args)
    {
        int [] Original = {10,15,20,25,30};
        int [] Copy = new int[Original.length];
       /* System.out.println("Original Array is:");
        Original[4]=456;
        for(int i=0;i<Original.length;i++)
            System.out.print(Original[i]+"\t");


        System.out.println("\nCopied Array is:");
        for(int i=0;i<Copy.length;i++)
            System.out.print(Copy[i]+"\t");

        */
        // Method 2
       /* System.arraycopy(Original,0,Copy,0,Original.length);
        Original[2]=2345;
        for(int i=0;i<Original.length;i++)
            System.out.print(Original[i]+"\t");


        System.out.println("\nCopied Array is:");
        for(int i=0;i<Copy.length;i++)
            System.out.print(Copy[i]+"\t");
       */
        // Method 3

        System.out.println("Original Array is:");

        System.arraycopy(Original, 0, Copy, 0, Original.length);
            Original[2]=456;

        for(int i=0;i<Original.length;i++)
            System.out.print(Original[i]+"\t");


        System.out.println("\nCopied Array is:");
        for(int i=0;i<Copy.length;i++)
            System.out.print(Copy[i]+"\t");


    }
}
