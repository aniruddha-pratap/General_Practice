package Miscellaneous;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean happyNumber (int num) {
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        while(set.add(num)) {
            int temp = num;
            while(temp!=0) {
                int digit = temp % 10;
                temp = temp/10;
                sum += digit * digit;
            }
            if(sum == 1)
                return true;
            num = sum;
            sum = 0;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.happyNumber(36));
    }
}
