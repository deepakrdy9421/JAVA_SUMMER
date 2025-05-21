package nrec1;
import java.util.*;
public class day8_vec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>l1=new Vector<Integer>();
		l1.add(12);
		l1.add(23);
		l1.add(34);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}

	}

}
