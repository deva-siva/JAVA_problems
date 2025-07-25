package deva.java;

import java.util.Arrays;

public class stocks {

	public static void main(String[] args) {
		int arr[]= {7,10,1,3,6,9,2};
		int min=Arrays.stream(arr).min().getAsInt();
		int arr1[]=new int[7];
		int maxof=0;
		for(int i=min+1;i<arr.length-1;i++) {
			
			arr1[i]=Math.abs(min-arr1[i]);
			maxof=Arrays.stream(arr).max().getAsInt();}
			System.out.println(maxof);
			
		

	}

}
