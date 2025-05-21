package nrcm;

public class Day3_c {

	public static void main(String[] args) {
		String s1="banana";
		String s2="ananab";
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagram");
			return;
		}
		int[] count=new int[26];
		for(int i=0;i<=s1.length()-1;i++) {
			count[s1.charAt(i)-'a']++;
			count[s2.charAt(i)-'a']--;
			
			
		}
		boolean isAngaram=true;
		for(int i=0;i<26;i++) {
			if(count[i]!=0) {
				isAngaram=false;
				break;
			}
		}
		if(isAngaram) {
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It is not anagram");
		}

	}

}
