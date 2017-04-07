package Strings;

public class DetectCapital {

	public static boolean detectCapital(String s){
		if(s == null || s == ""){
			return false;
		}
		if(s.toLowerCase().equals(s) || s.toUpperCase().equals(s)){
			return true;
		}
		if((int)s.charAt(0) >= 65 && (int)s.charAt(0) <= 90){
			for(int i=1;i<s.length();i++){
				if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90)
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DetectCapital.detectCapital("gOogle"));
	}

}
