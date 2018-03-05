package Strings;

import java.util.Stack;

public class BasicCalculator {

    public static String calculate(String s) {
        int n=s.length();
        Stack<String> st = new Stack();
        //st.push("+");
        for(int i=0;i<n-1;i++){

            if(st.isEmpty()){
                st.push(Character.toString(s.charAt(i)));
            } else if (s.charAt(i)=='+'){
                int sum = (s.charAt(i+1) - '0')+Integer.parseInt(st.pop());
                st.push(Integer.toString(sum));
            } else if (s.charAt(i)=='-'){
                int sum = (s.charAt(i+1) - '0')-Integer.parseInt(st.pop());
                st.push(Integer.toString(sum));
            } else if (s.charAt(i)=='/'){
                int sum = (s.charAt(i+1) - '0')/Integer.parseInt(st.pop());
                st.push(Integer.toString(sum));
            } else if (s.charAt(i)=='*'){
                int sum = (s.charAt(i+1) - '0')*Integer.parseInt(st.pop());
                st.push(Integer.toString(sum));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(BasicCalculator.calculate("3+4/2"));
    }
}
