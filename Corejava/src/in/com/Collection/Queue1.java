package in.com.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		Queue <Integer> num = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		num.add(80);
		num.add(20);
		num.add(90);
		num.add(100);
		
		System.out.println(num);
		
		num.offer(56);
		System.out.println(num);
		
		System.out.println(num.peek());
		
		num.poll();
		System.out.println(num);
		
		num.remove();
		System.out.println(num);
		
		
		
		
	
	}

}
