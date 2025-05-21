package nrec1;
import java.util.*;
public class day8_que {

	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<Integer>();
		q1.add(24);
		q1.offer(45);
		q1.add(95);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);


	}

}
