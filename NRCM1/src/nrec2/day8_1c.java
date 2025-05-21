package nrec1;
import java.util.*;
public class day8_1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer>l2=new ArrayList<Integer>();
		l2.add(9);
		l2.add(2);
		l2.addAll(l1);
		l2.add(null);
		System.out.println(l2);
		Iterator i1=l2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
