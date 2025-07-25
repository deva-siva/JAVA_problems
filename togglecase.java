package deva.java;
import java.util.*;
public class togglecase {

	public static void main(String[] args) {
	  String s="Hello";
	  char ch[]=s.toCharArray();
	  for(int i=0;i<ch.length;i++) {
		  if((s.charAt(i)>='a')&&(s.charAt(i)<='z')){
			  ch[i]=(char)(ch[i]-32);
		  }
		  else if((s.charAt(i)>='A')&&(s.charAt(i)<='Z')){
			  ch[i]=(char)(ch[i]+32);
		  }
	  }
	  System.out.println(ch);

	}

}
