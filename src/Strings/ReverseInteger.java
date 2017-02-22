package Strings;

public class ReverseInteger {

	public static int reverseInteger(int n){
		long reverse = 0;
		int temp = n;
		while(temp!=0){
			reverse = reverse*10+temp%10; 
			temp=temp/10;		
			if( reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                return 0;
		}
		return (int)reverse;
	}
	
	
	public static void main(String []args){
		System.out.println(ReverseInteger.reverseInteger(-123));
	}
}
