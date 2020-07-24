package queue;

import java.util.*;

public class QueueInterfaceStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue is an interface and it is implemented by the LinkedList Class
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.isEmpty());
		System.out.println(q.poll());//Poll means dequeue and print
		System.out.println(q.peek());//Only show the front element
	}

}
