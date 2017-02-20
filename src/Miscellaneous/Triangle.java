package Miscellaneous;

import java.util.Stack;

public class Triangle {

	public static String triangleType(int a, int b, int c){
		if(a<=0 || b<=0 || c<=0){
			return "Invalid Input";
		}
		if(a+b<c || b+c<a ||a+c<b ){
			return "Invalid Input";
		}
		if(a==b && b==c){
			return "Equilateral";
		}else if((a==b || b==c || c==a)){
			return "Isosceles";
		}else{
			return "Scalene";
		}
		
	}
	
	public static void main(String []args){
		String result = Triangle.triangleType(4, 5, 9);
		System.out.println(result);
		Stack<Integer> s = new Stack<Integer>();
	}
}
