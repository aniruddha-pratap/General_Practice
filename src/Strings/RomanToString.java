package Strings;

public class RomanToString {
	
	 public static int romanToInt(String s) {
		 int result=0;
		 int n =s.length();
		 for(int i=0;i<n;i++){
			 if(s.charAt(i)=='I' && s.charAt(i+1)=='V'){
				 result = result + 4; 
			 }else if(s.charAt(i)=='I'){
				 result = result + 1;
			 }
			 else if(s.charAt(i)=='V'){
				 result = result + 5;
			 }/**
			 else{
				 result = result + 10;
			 }**/
		 }
		 return result;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RomanToString.romanToInt("XIV"));
	}

}
