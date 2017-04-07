package Strings;

public class FindDifference {
	
	public static char findDifference(String s, String t){
		int sSum = 0, tSum = 0;
        for(int i =0 ;i<s.length();i++){
            sSum = sSum + (int)s.charAt(i);
        }
        for(int j =0 ;j<t.length();j++){
            tSum = tSum + (int)t.charAt(j);
        }
        return (char)(tSum - sSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindDifference.findDifference("abcd", "abcde"));
	}

}
