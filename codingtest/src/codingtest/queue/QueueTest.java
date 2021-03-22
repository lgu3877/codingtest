package codingtest.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(5);
		System.out.println(q);
		q.offer(4);
		System.out.println(q);
		q.offer(7);
		System.out.println(q);
		q.offer(10);
		System.out.println(q);
		q.offer(4);
		System.out.println(q);
		q.offer(3);
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		
	}

}
