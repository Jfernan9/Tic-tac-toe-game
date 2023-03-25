package SBA;

import java.util.ArrayList;

public class retClassImpl {
    public static void main(String [] args)
    {
        ArrayList<String> originalArrayWithData = retClass.createArrayWithData();
        retClass.insertEmptyspace(originalArrayWithData,0);
        originalArrayWithData.set(0,"The rain in California");

        for(int i=0;i<originalArrayWithData.size();i++)
        {
            System.out.print(originalArrayWithData.get(i)+" ");
        }
        System.out.println();
        System.out.println("ArrayList Elements are: al "+originalArrayWithData);
    }

}
         // insertEmptySpace(int indexLocation)
         //arrayListObject.set(indexLocation, "")
