package deva.java;

import java.util.Scanner;

public class messi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int res,power,dig,temp;
		while(num!=0) {
			power=1;
			res=0;
			temp=num;
			while(num!=0) {
				dig=num%10;
				if(dig>0)
				res=1*power+res;
				else
					res=0*power+res;
			}
		}

	}

}
