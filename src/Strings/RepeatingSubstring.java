package Strings;

public class RepeatingSubstring {
	
	public static boolean repeatingSubstring(String str){
		int n = str.length();
		StringBuilder subStr = new StringBuilder();
		for(int i=0;i<n;i++){
			subStr.append(Character.toString(str.charAt(i)));
			System.out.println(subStr.toString());
			if(!str.contains(subStr.toString())){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RepeatingSubstring.repeatingSubstring("aba"));
	}

}
