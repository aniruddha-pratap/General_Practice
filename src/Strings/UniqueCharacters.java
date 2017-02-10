package Strings;

public class UniqueCharacters {
	
	public boolean uniqueChar(String s){
		int n = s.length();
		int i=0;
		for(i=0;i<n;i++){
			char temp = s.charAt(i);
			String str = s.substring(i+1);
			if(str.contains(Character.toString(temp))){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String []args){
		UniqueCharacters uc = new UniqueCharacters();
		boolean res = uc.uniqueChar("abcde");
		System.out.println(res);
	}
}
