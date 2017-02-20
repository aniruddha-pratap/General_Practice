package Strings;
import java.util.*;
public class StringManipulation {
	
	static String CountCharacter(String s){
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		int maxCount = 0;
		char maxCh = ' ';
		for(int i=0;i<s.length();i++){
			if(charCount.containsKey(s.charAt(i))){
				int count = charCount.get(s.charAt(i));
				charCount.put(s.charAt(i), count + 1);
				if(maxCount<count+1){
					maxCount = count+1;
					maxCh = s.charAt(i);
				}
			}
			charCount.put(s.charAt(i), 1);
			
		}
		return Character.toString(maxCh);
	}
	
	public static void main(String args[]){
		String count = StringManipulation.CountCharacter("abb");
		System.out.println(count);
	}
}
