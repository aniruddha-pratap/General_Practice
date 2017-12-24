package Array;

import java.util.Arrays;

public class TwoSumSortedArray {

    public static int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int start = 0, end = numbers.length - 1;
        while(start < end) {
            int sum = (numbers[start] + numbers[end]);
            if(target  == sum) {
                res[0] = start+1;
                res[1] = end+1;
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        System.out.print(start + " " + end);
        return res;
    }

    public static void main(String args[]){
        int n[]={'2', '4', '5'};
        int res[] = TwoSumSortedArray.twoSum(n, 6);
        System.out.print(res[0] + " " + res[1]);
    }
}
