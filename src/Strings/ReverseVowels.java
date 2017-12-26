package Strings;

import java.util.Arrays;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        int start =0 , end = s.length() - 1;
        char str[] = s.toCharArray();
        while(start < end) {
            if(str[start] == 'a' || str[start] == 'e' ||str[start] == 'i' ||str[start] == 'o' || str[start] == 'u') {
                if(str[end] == 'a' || str[end] == 'e' ||str[end] == 'i' ||str[end] == 'o' || str[end] == 'u') {
                    char temp = str[end];
                    str[end] = str[start];
                    str[start]= temp;
                } else {
                    end--;
                }
            } else{
                start++;
            }
            start++;
            end--;

        }
        return Arrays.toString(str);
    }

    public static void main(String args[]) {
        System.out.println(ReverseVowels.reverseVowels("hello"));
    }
}
