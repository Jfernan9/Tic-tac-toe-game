package SBA;

import java.util.ArrayList;

public class retClass {

        public static ArrayList<String> createArrayWithData()
        {
            ArrayList<String> list = new ArrayList<String>();

            list.add("the");
            list.add("rain");
            list.add("in");
            list.add("spain");

            return list;
        }
        // Function to display the array List
        public static void displayNewArrayListWithOutSpaces(ArrayList<String> list)
        {
            System.out.println(list);
        }
        public static void insertEmptyspace(ArrayList<String>list,int index){
            list.add(index,"");
        }
    }


