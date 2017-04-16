package Strings;

public class ReverseStringIII {
	
	static String reverse(String s){
		int i=0,j=s.length()-1;
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		return str.toString();
	}
	
	public static void reverseStringIII(String str){
		String strArray[] = str.split(" ");
		StringBuilder s = new StringBuilder();
		for(int i = 0;i<strArray.length;i++){
			s.append(reverse(strArray[i]));
			s.append(" ");
		}
		System.out.println(s.toString());
	}
	
	public static void main(String[] args) {
		ReverseStringIII.reverseStringIII("Let's take LeetCode contest");
	}

}
