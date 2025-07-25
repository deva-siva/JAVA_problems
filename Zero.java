package deva.java;

import java.util.Arrays;

class zero{
	public static void main(String args[]) {
		int arr[]= {10,3,5,6,20};
		Arrays.sort(arr);
		int i=arr.length;
			int results= arr[i-1]*arr[i-2]*arr[i-3];
		
		System.out.println(results);
	}
}



