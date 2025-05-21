package nrec1;
import java.util.*;
public class day8_1f {

	public static void main(String[] args) {
		List<Object>l1=new ArrayList<Object>();
		l1.add(1);
		l1.add(10);
		l1.add(20);
		System.out.println(l1);
		List<Object>extra=Arrays.asList(30,40,50);
		l1.addAll(1,extra);
		System.out.println(l1);
		System.out.println(l1.indexOf(30));
		System.out.println(l1.get(3));
		Object[] a1=l1.toArray();
		for(Object a2:a1) {
			System.out.println(a2);
		}

	}

}
