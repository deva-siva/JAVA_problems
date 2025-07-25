package deva.java;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int digits =String.valueOf(n).length();
		int res =0;
		int l =n;
		while(n!=0) {
			int d =n%10;
			res+=Math.pow(d, digits);
			n/=10;
		}if(res!=l) 
		System.out.println(res);
		else
		System.out.println("1");
	}
	}

