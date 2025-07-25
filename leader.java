package deva.java;

public class leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {7,5,12,1,3,2}; 
for(int i=0;i<arr.length;i++) {
	int count =0;
	int a=0;
for(int j=i+1;j<arr.length;j++) {
	count++;
	if(arr[i]>arr[j]) {
		a++;
	}
}
if(a==count){
	System.out.print(arr[i]+" ");
	
}
}

	}

}
