import java.util.ArrayList;

public class myArrayList {
    public static void RemoveSpaces(){
        ArrayList<String> whiteSpaces = new ArrayList<>();
        whiteSpaces.add("potato");
        whiteSpaces.add("ch i ps");
        whiteSpaces.add("ca n dy");
        ArrayList<String> blackSpaces = new ArrayList<>();
        blackSpaces.add("water");
        blackSpaces.add("milk");
        blackSpaces.add("juice");
        for (int i =0; i< whiteSpaces.size(); i++){
            if (! whiteSpaces.get(i).equals("  "))
                blackSpaces.add(whiteSpaces.get(i).replaceAll("\\s+",""));

        }
        System.out.println("This is "+ whiteSpaces);
        System.out.println("This is "+ blackSpaces);
    }




    public static void main(String[] args) {
        RemoveSpaces();


    }
}
