package Miscellaneous;

import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (String s : ops) {
            if (s.equals("C")) sum -= stack.pop();
            else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
                sum += stack.peek();
            }
            else if (s.equals("+")) {
                int last = stack.pop();
                int add = last + stack.peek();
                stack.push(last);
                stack.push(add);
                sum += stack.peek();
            }
            else {
                stack.push(Integer.parseInt(s));
                sum += stack.peek();
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        String s[] = {"C","2", "5", "D","+"};
        System.out.println(BaseballGame.calPoints(s));
    }

}
