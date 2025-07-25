package deva.java;
import java.util.*;
public class stackspl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<Character> se=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{'||c=='['||c=='(') 
				se.push(c);
				else if(se.isEmpty()||(c==')'&&se.pop()!='(')||(c==']'&&se.pop()!='[')||(c=='}'&&se.pop()!='{')) {
					System.out.println("false");
					return;
				}}
			
			System.out.println(se.isEmpty()?true:false);
		}}


