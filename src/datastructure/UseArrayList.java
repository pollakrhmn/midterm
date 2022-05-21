package datastructure;

import java.util.ArrayList;
import java.util.ListIterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

        ArrayList <String> states = new ArrayList<>();

        states.add("New York");
        states.add("California");
        states.add("Boston");
        states.add("Texas");
        states.add("North Carolina");
        states.add("Florida");
        states.add("Alaska");
        states.add("New Jersey");
        states.add("Virginia");
        System.out.println("ArrayList: \n" + states + "\n");

        System.out.println("Peek: \n" + states.get(2));

       String remove = states.remove(4);
        System.out.println("\nRemove: \n" + remove);

        ListIterator<String> iterate = states.listIterator();
        System.out.println("\nList Iterator with While Loop: ");

        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");

        }

        System.out.println("\n\nFor-Each Loop: ");
        for(String s : states) {

            System.out.print(s);
            System.out.print(", ");

        }


	}

}
