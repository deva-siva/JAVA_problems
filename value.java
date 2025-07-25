package deva.java;
import java.util.Arrays;
public class value {

	public static void main(String[] args) {
		int arr[]= {-2,6,-3,-10,0,2};Arrays.sort(arr);
		int i=arr.length;
		if(i<3) {
			return;}
		int res= arr[0]*arr[1]*arr[i-1];
		int res1=arr[i-1]*arr[i-2]*arr[i-3];
		int bro=Math.max(res,res1);
		System.out.println(bro);
	
		}	

	}


