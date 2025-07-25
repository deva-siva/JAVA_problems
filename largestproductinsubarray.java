package deva.java;
import java.util.*;
public class largestproductinsubarray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int target=10;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int product=1;
			for(int j=i;j<arr.length;j++) {
				
				 product =product*arr[j];
					if(product<target) {
						count++;
					}
					else {
						break;
					}
				}
		}	
			
			System.out.print("totalcount =  " + count);
		}
	
	}

	