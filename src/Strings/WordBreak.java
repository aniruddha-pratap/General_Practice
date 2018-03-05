package Strings;
import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean arr[]=new boolean[s.length()+1];
        arr[0]=true;
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++) {
                if(arr[j] && wordDict.contains(s.substring(j,i))) {
                    arr[i] =true;
                    break;
                }
            }
        }
        return arr[s.length()];
    }

    public static void main(String[] args) {
        List s = new ArrayList();
        s.add("a");
        s.add("b");
        s.add("cd");
        s.add("e");
        System.out.println(WordBreak.wordBreak("abcd", s));
    }
}
