package nrec1;
import java.util.*;
public class day8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {72,89,65,51};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1, 51);
		System.out.println(a);
		for(int a1:arr1) 
			System.out.println(a1);
		    

	}

}
