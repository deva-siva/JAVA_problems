package deva.java;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 
 int arr[]=new int [10];
 int j=0;
 for(int i=0;i<10;i++)
 {
	 if(i%2==0)
	 {
		arr[j]=i;
		j++;
	 }
 }
 for(int i=0;i<arr.length;i++)
 {
	 System.out.print( " " + arr[i]);
 
	 
 }
	}

}
