package deva.java;

public class strm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=" hello hi how are you";
		String s=" ";
		for(int i =name.length()-1;i>=1;i--)
		{
			s=s+name.charAt(i);
		}
		System.out.println(s);     

	}

}