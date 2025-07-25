package deva.java;

import java.util.*;

public class stackrev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<Character> s1=new Stack<>();
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			s1.push(s.charAt(i));
		}
		while(!s1.isEmpty()) {
			res.append(s1.pop());
		}
		
		
		System.out.print(res);
	}

}
