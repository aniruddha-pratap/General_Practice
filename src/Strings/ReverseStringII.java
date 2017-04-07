package Strings;

public class ReverseStringII {
	
	public static String reverseString(String s){
		StringBuilder str = new StringBuilder(s);
		return str.reverse().toString();
	}
	
	public static String reverseStringII(String str, int k){
		int i = 0 , l = k*2;
		int n = str.length();
		StringBuilder s = new StringBuilder();
		while(i<n){
			int j = i+k <= n ? i+k : n;
			s = s.append(reverseString(str.substring(i, j)));
			i=j;
			j = i+k <= n ? i+k : n;
			s = s.append(str.substring(i, j));
			i=j;
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseStringII.reverseStringII("abcdefghij", 2));
	}

}
