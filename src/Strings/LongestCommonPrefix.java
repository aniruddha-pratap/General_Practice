package Strings;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs){
		if(strs.length == 0){
			return "";
		}
		StringBuilder s  = new StringBuilder();

		int shortLen = 0;

		for(int i=0; i<strs.length; i++) {
			if(strs[shortLen].length() > strs[i].length())
				shortLen = i;
		}
		String shortest = strs[shortLen];
		for(int j=0; j<strs.length; j++){
			if(j==shortLen)
				continue;
			if(strs[j].indexOf(shortest) != 0)
				shortest = shortest.substring(0, shortest.length()-1);
		}
		return shortest;
	}
	
	public static void main(String[] args){
		String s[]= {"abc", "abcd", "abcde", "abcdef"};
		System.out.println(LongestCommonPrefix.longestCommonPrefix(s));
	}
}
