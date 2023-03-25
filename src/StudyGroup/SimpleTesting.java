package StudyGroup;

public class SimpleTesting {
    int[] a;
    public SimpleTesting(){
        a = new int[]{0,0,0};
    }

    public static void main(String[] args) {
        SimpleTesting st= new SimpleTesting();
        System.out.println("Array Elements");
        for(int i : st.a){
            System.out.println(i);
        }
    }
}
