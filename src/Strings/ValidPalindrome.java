package Strings;

public class ValidPalindrome {

    public static boolean isPalidnrome(String s) {
        int start=0, end=s.length()-1;
        if(s.length() == 0) {
            return true;
        }
        s=s.toLowerCase();

        while(start<=end){
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }else if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            } else if(s.charAt(start) != s.charAt(end)){
                    return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String args[]) {
        String a  = "a*@#$%^&&*ba";
        System.out.println(ValidPalindrome.isPalidnrome(a));
    }
}
