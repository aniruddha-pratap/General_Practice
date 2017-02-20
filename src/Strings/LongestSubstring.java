package Strings;
import java.util.*;

public class LongestSubstring {
	
	static String longestSubstring(String s){
		HashMap<Character, Integer> str = new HashMap<Character, Integer>();
 		int n =s.length();
 		int lenSubstr = 0;
 		String result = "";
		for(int i=0;i<n;i++){
			if(str.containsKey(s.charAt(i))){
				i=str.get(s.charAt(i));
				str.clear();
			}else{
				str.put(s.charAt(i), i);
			}
			if(lenSubstr < str.size()){
				lenSubstr = str.size();
				result = str.keySet().toString();
			}
		}
		//System.out.println(lenSubstr);
		return result;
	}
	
	public static void main(String []args){
		String a = LongestSubstring.longestSubstring("aau");
		System.out.println(a);
	}
}



