package nrcm;

public class Day3_d {

	public static void main(String[] args) {
		int a[]= {12,25,76,89};
		int a1[]=new int[a.length];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>min) {
				min=a[i];	
				}
			}
		System.out.println("max: "+min);
		
		}

}
