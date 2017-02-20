package Stacks;
import java.util.*;

public class LongestValidParenthesis {

	public static int longestValidParenthesis(String s){
		Stack<Character> st = new Stack<Character>();
		int globalsum=0;
		int n = s.length();
		int max = 0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)==')'){
                if(!st.isEmpty()){
                    char ch = st.peek();
                    if(ch == '('){
                    	st.pop();
                    	max = max+2; 
                        if(globalsum<max){
                        	globalsum =max;
                        }
                    }
                }
            }else{
            	st.push(s.charAt(i));
            	System.out.println("reached here");
            	max =0;
            }
		}
		return globalsum;
	}
	
	public static void main(String []args){
		int n=LongestValidParenthesis.longestValidParenthesis("()()()");
		System.out.println(n);
	}
}
