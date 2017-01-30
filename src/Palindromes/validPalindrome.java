package Palindromes;

public class validPalindrome {

	public boolean isPalindrome(String s) {
        if(s == null){
            return true;
        }
        else{
            StringBuilder sf = new StringBuilder(s);
            String reverse = sf.reverse().toString();
            if(reverse.equalsIgnoreCase(s)){
                return true;
            }else{
                return false;
            }        
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validPalindrome v = new validPalindrome();
		boolean result = v.isPalindrome("A man a plan a canal Panama");
		System.out.println(result);
	}

}
