package Stacks;

import java.util.*;

public class ParanthesisBalancing {

	public static boolean paranthesisBalancing(String str){
		Stack<Character> s = new Stack<Character>();
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				s.push(')');
			} else if (str.charAt(i) == '{') {
				s.push('}');
			} else if (str.charAt(i) == '[') {
				s.push(']');
			} else if (s.isEmpty() || str.charAt(i) != s.pop()) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{}[]";
		System.out.println(ParanthesisBalancing.paranthesisBalancing(str));
	}

}
