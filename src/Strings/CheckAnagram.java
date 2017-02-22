package Strings;

import java.util.Arrays;

public class CheckAnagram {

	public static boolean isAnagram(String s, String t) {
		char a[] = s.toCharArray();
		Arrays.sort(a);
		char b[] = t.toCharArray();		
		Arrays.sort(b);
		if(Arrays.equals(a, b)){
			return true;
		}
		
		return false;
    }
	
	public static void main(String []args){
		System.out.println(CheckAnagram.isAnagram("rat", "nagaram"));
	}
}
