package Strings;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs){
		if(strs.length == 0){
			return "";
		}
		StringBuilder s  = new StringBuilder();
		for(int i=0;i<strs[0].length();i++){
			char c = strs[0].charAt(i);
			for(String str : strs){
				if(str.length()<i+1 || str.charAt(i) != c){
					return s.toString();
				}
			}
			s.append(c);
		}
		return s.toString();
	}
	
	public static void main(String[] args){
		String s[]= {};
		System.out.println(LongestCommonPrefix.longestCommonPrefix(s));
	}
}
