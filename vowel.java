package deva.java;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;int cons=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				count++;}
			else {
				cons++;
			}
		}
		
			

				System.out.println("vowels = "+count);
				System.out.println("consonants = "+cons);
				
			
		
	}

}
