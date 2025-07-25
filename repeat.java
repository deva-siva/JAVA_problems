package deva.java;

public class repeat {

	public static void main(String[] args) {
	
		int arr[]= {1,2,4,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				break;
			}
			if(sum%2==0)
			{
				System.out.print( ","+sum/2);  
			}
		}
	}
}

		
