package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

        Queue<String> pq = new PriorityQueue<>();

        pq.add("Redbull");
        pq.add("Monster");
        pq.add("C4");
        pq.add("Bang");
        pq.add("Coffee");
        System.out.println("Queue: \n" + pq);

        System.out.println("\nPeek: \n" + pq.peek());

        pq.remove("Bang");
        System.out.println("\nUpdated Queue after removal: \n" + pq);

        pq.poll();
        System.out.println("\nUpdated Queue after removing the head: \n" + pq);

        System.out.println("\nIterator with While Loop: ");
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        System.out.println("\nFor-Each Loop: ");
        for (String drink : pq) {
            System.out.println(drink);
        }



	}

}
