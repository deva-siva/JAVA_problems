package deva.java;

import java.util.*;

public class anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char str1[]=s1.toCharArray();
		char str2[]=s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		boolean b=false;
		 if(s1.length()!=s2.length()) {
			 System.out.println(b);
			 return ;
		 }else {
		 for(int i=0;i<s1.length();i++) {
			 if (str1[i] != str2[i]) {
		                b = false;
		                break;
		            }
		        }
		 
		        System.out.println(b);
					 
				 
			 }
		 }
		
}