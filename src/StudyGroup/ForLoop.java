package StudyGroup;

public class ForLoop
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("This are the elements in the array");
        for (int i = -1; i<arr.length;i++ ){
            try{
                System.out.println(arr[i+1]);
            } catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("The Array is not that long");
            }

        }

    }
}
