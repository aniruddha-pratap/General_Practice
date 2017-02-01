package Stacks;

import java.util.*;

public class ParanthesisBalancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '('){
				if(!s.isEmpty()){
					char temp = s.peek();
					if(temp == ')'){
						s.pop();
					}
				}else{
					System.out.print("Not Valid");
				}
			}
			else if(str.charAt(i) == '('){
				if(!s.isEmpty()){
					char temp = s.pop();
					if(temp == ')'){
						s.pop();
					}
				}else{
					System.out.print("Not Valid");
				}
			}
			else if(str.charAt(i) == '('){
				if(!s.isEmpty()){
					char temp = s.pop();
					if(temp == ')'){
						s.pop();
					}
				}else{
					System.out.print("Not Valid");
				}
			}
		}
	}

}
