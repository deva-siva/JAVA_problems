package deva.java;

import java.util.Scanner;

public class stringrev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);}
			System.out.println(rev);
			if(str.equals(rev)) {
				System.out.println("palindrome");
		}
			else {
				System.out.println("not palindrome..." );
			}
		

	}

}
