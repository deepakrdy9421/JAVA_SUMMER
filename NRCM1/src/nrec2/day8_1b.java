package nrec1;
import java.util.*;
public class day8_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(4);
		l1.add(4);
		List<Integer>l2=new ArrayList<Integer>(l1);
		l2.add(1);
		l2.add(4);
		System.out.println(l2);
	}

}
