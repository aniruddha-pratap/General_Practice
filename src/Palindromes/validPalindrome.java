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
		//validPalindrome v = new validPalindrome();
		//boolean result = v.isPalindrome("A man a plan a canal Panama");
		//System.out.println(result);
		String str = "aba";
		String p = str.toLowerCase();
		int i =0 , j = p.length();
		while(i<j){
			if(p.charAt(i)==p.charAt(j-1)){
				i++;
				j--;
			}else{
				break;
			}
		}
		System.out.println("i "+i+"j "+j);
		if(i>=j){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}

}
