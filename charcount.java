package deva.java;
import java.util.*;

public class charcount {

	public static void main(String[] args) {
		String str="sotta deva";
		for(int i=0;i<str.length();i++) {
			int count=1;
			char ch=str.charAt(i);
			if (str.indexOf(ch) != i) continue;
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)){	
					count++;
				}
			}
			System.out.println(ch +"="+count);
		}

	}

}
