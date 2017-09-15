package Strings;

public class RepeatedSubString {

	public static boolean repeatedSubstringPattern(String s) {
        int i = s.length();
        for(int j=i/2;j>=1;j--){
            if(i%j==0){
                int k = i/j;
                String subString = s.substring(0,j);
                int l;
                for(l=1;l<k;l++){
                    if(!subString.equals(s.substring(l*j,j+l*j))){
                        break;
                    }
                }
                if(l==k){
                    return true;
                }
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RepeatedSubString.repeatedSubstringPattern("abab"));
		System.out.println(RepeatedSubString.repeatedSubstringPattern("aba"));
	}

}
