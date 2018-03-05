package Miscellaneous;

import java.util.*;

public class GenerateParanthesis {

    public List<String> generateParanthesis(int n){
        List<String> list = new ArrayList<String>();
        backtrack(list,"", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String s, int open, int close, int max){
        if(s.length() == max*2) {
            list.add(s);
            return;
        }

        if(open < max) {
            backtrack(list, s+"(", open+1, close, max);
        }
        if(close < open) {
            backtrack(list, s+")",open, close+1, max);
        }
    }

    public static void main(String[] args) {
        List<String> gen = new GenerateParanthesis().generateParanthesis(3);
        for(int i=0; i<gen.size(); i++){
            System.out.println(gen.get(i));
        }
    }
}
