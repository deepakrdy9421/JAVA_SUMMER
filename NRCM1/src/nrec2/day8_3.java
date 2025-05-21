package nrec1;
import java.util.*;
public class day8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>l2=new LinkedList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		System.out.println(l2);

		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(0, 50);
		l1.addFirst(20);
		l1.addLast(30);
		l1.add(0, 40);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);

	}

}
