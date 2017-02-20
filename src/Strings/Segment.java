package Strings;

public class Segment {
	
	static int segments(String s){
	     int count  = 0;
	     for(int i=0;i<s.length()-1;i++){
		   	 if(s.charAt(i)!=' ' && (i==0||s.charAt(i-1) == ' ')){
	   		     count++;
			 }
	     }
		 return count;
	}
	
	public static void main(String []args){
		int n = Segment.segments("My name is Anthony Gonzalvez");
		System.out.println(n);
	}
	
}
