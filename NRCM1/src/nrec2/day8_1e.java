package nrec1;
import java.util.*;
public class day8_1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object>l1=new ArrayList<Object>();
		l1.add(1);
		l1.add("Hello");
		l1.add("World");
		System.out.println(l1);
		List<Object>extra=Arrays.asList("Deepak","Reddy");
		l1.addAll(1,extra);
		System.out.println(l1);
		System.out.println(l1.indexOf("Deepak"));
		System.out.println(l1.get(3));

	}

}
