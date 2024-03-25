package queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String... k) {
		PriorityQueue pq = new PriorityQueue();

		pq.add("Pune");
		pq.offer("Indore");
		pq.offer("Mumbai");
      
		pq.remove();
		System.out.println(pq);
		System.out.println(pq.poll());

	}

}
