package nrec1;
import java.util.*;
public class day8_4 {

	public static void main(String[] args) {
		Stack<Integer>s1=new Stack<Integer>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1);
		Iterator i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
