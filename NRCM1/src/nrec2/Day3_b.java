package nrcm;

public class Day3_b {

	public static void main(String[] args) {
		String str="deepakreddy";
		String vow="";
		String cons="";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				vow+=ch;
			else if (ch>='a' && ch<='z') 
				cons+=ch;
		}
		System.out.println("Vowels:"+vow+",Consonants:"+cons);
		

	}

}
