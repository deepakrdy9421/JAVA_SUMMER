package nrcm;

public class Day3_e {

	public static void main(String[] args) {
		int a[]= {2,3,1,2,1,4,5};
		int a1[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
		if(count==1) {
			a1[index++]=a[i];
		}
		}
		System.out.println("Not Repeated : ");
		for(int i=0;i<index;i++) {
			System.out.println(a1[i] +" ");
		}
			

	}

}
