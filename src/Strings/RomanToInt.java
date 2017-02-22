package Strings;

public class RomanToInt {
	
	 public static int romanToInt(String s) {
		 int result=0;
		 int n =s.length();
		 int count[]=new int[n];
		 for(int i=0;i<n;i++){
			 if(s.charAt(i)=='I'){
				 count[i]=1; 
			 }else if(s.charAt(i)=='V'){
				 count[i]=5;
			 }
			 else if(s.charAt(i)=='L'){
				 count[i]=50;
			 }
			 else if(s.charAt(i)=='C'){
				 count[i]=100;
			 }
			 else if(s.charAt(i)=='D'){
				 count[i]=500;
			 }
			 else if(s.charAt(i)=='M'){
				 count[i]=1000;
			 }
			 else{
				 count[i]=10;
			 }
		 }
		 
		 for(int i=0;i<n-1;i++){
			 if(count[i]<count[i+1]){
				 result=result-count[i];
			 }else{
				 result=result+count[i];
			 }
		 }
		 return result+count[n-1];
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RomanToInt.romanToInt("XX"));
	}

}
