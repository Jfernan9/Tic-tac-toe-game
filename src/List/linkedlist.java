package List;
import java.util.Iterator;
import java.util.LinkedList;



     public class linkedlist {
        public static void main(String[] args) {
            LinkedList<String> fruit = new LinkedList<String>();

            // use first method add items
            fruit.add("apple");
            fruit.add("orange");
            fruit.add("banana");

            // use second method remove items
            {
                fruit.remove("apple");
            fruit.remove("orange");
            // we used add method to add new items
            fruit.add("Kiwi");
            fruit.add("Mango");

            //third method reverse an element

            Iterator<String> itr = fruit.descendingIterator();
            while (itr.hasNext())
                System.out.println(itr.next());

            }

        }

    }
