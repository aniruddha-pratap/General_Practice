package Palindromes;

public class validPalindrome {

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i =0 , j = s.length();
		while(i<j){
			if(s.charAt(i)==s.charAt(j-1)){
				i++;
				j--;
			}else{
				break;
			}
		}
		return i>=j;
    }

    public static boolean numberPalindrome(int n) {
		int reverse = 0, temp=Math.abs(n);
		while(temp>0){
			reverse = (reverse*10) + temp%10;
			temp=temp/10;
		}
		System.out.println("Reverse *** "+reverse);
		return Math.abs(n) == reverse;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//validPalindrome v = new validPalindrome();
		//boolean result = v.isPalindrome("A man a plan a canal Panama");
		//System.out.println(result);

		System.out.println(validPalindrome.numberPalindrome(-232));

	}

}
