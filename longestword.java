package deva.java;
import java.util.*;
public class longestword {

	public static void main(String[] args) {
		String str="java programming language";
		String[] s=str.split(" ");
		String d="";
		for(int i=0;i<s.length;i++) {
		if(s[i].length()>d.length()) {
			d=s[i];
		}
			
		}
System.out.println(d);
	}

}
