package Strings;

import java.util.Arrays;

public class ReverseInPlace {
	
	/*public static void reverseWords(char[] s) {
		reverse(s, 0, s.length);
		int i=0;
		for (int j = 0; j <=s.length; j++) {
			if (j == s.length || s[j] == ' ') {
				reverse(s, i, j);
				i = j + 1;
			}
		}
		for(int k=0;k<s.length;k++){
			System.out.print(s[k]);
		}
	}*/
	
	private static void reverse(char[] s, int start, int end) {
		while(start<end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}


	public static String reverseWords(String s) {
		int j=0;
		char str[] = s.toCharArray();
		reverse(str, 0, s.length()-1);
        for(int i=0; i<s.length(); i++){
	        if(str[i] == ' '){
                reverse(str, j, i-1);
                j=i+1;
            }

        }
        return new String(str);
	}


	public static String reverseString(String s, int k){
	    int j=0;
	    char str[] = s.toCharArray();
	    for(int i=0;i<s.length(); i=i+(2*k)) {
	        j= i+k <= s.length() ? i+k : s.length();
	        reverse(str, i, j-1);
	        j=i;
        }
        return new String(str);
    }


	public static void main(String[] args) {
		String s = "abcdefgh12345678";
        System.out.println(ReverseInPlace.reverseString(s, 4));
        //ReverseInPlace.reverseWords(s);
    }

}
