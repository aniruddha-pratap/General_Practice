package Strings;

import java.util.*;

public class AllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0; i<s.length(); i++) {
            
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = AllAnagrams.findAnagrams("cbaebabacd", "abc");
        for(int k=0; k<res.size(); k++){
            System.out.println(res.get(k));
        }
    }

}

