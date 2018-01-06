package Strings;

import java.util.Arrays;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        int start = 0, end = s.length()-1;
        char str[] = s.toCharArray();
        String vowels = "aeiouAEIOU";

        while(start < end){
            if(vowels.contains(str[start]+"")) {
                if(!vowels.contains(str[end]+"")) {
                    end--;
                } else {
                    char temp = str[end];
                    str[end] = str[start];
                    str[start]= temp;
                    start++;
                    end--;
                }
            }else{
                start++;
            }
        }

        return new String(str);
    }

    public static void main(String args[]) {
        System.out.println(ReverseVowels.reverseVowels("hello"));
    }
}
