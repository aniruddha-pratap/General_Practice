package Strings;

public class ReverseInPlace {
	
	public static void reverseWords(char[] s) {
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
	}
	
	private static void reverse(char[] s, int start, int end) {
		for (int i = 0; i < (end - start) / 2; i++) {
			char temp = s[start + i];
			s[start + i] = s[end - i - 1];
			s[end - i - 1] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		char s[] = "Let's take LeetCode contest".toCharArray();
		ReverseInPlace.reverseWords(s);
	}

}
