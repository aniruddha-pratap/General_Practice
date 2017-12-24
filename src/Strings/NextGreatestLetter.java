package Strings;

public class NextGreatestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0, end = n-1 ;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Finally start: "+ start + " finally end: " + end);
        return (start == n) ? letters[0] : letters[start];
    }

    public static void main(String args[]) {
        char a [] = {'b', 'b', 'd', 'e', 'f', 'f', 'f', 'f', 'f', 'f'};
        System.out.println("Answer "+NextGreatestLetter.nextGreatestLetter(a, 'z'));
    }

}
