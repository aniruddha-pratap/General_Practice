package Array;

import java.util.Arrays;

public class ShortedUnsortedContinuousArray {

    public static int findUnsortedSubarray(int[] nums) {
        int begin = nums.length - 1, end = nums.length - 1;

        int sortedArray[] = nums.clone();
        Arrays.sort(sortedArray);

        for(int i = 0;i < nums.length; i++) {
            if(sortedArray[i] != nums[i]) {
                begin = i;
                break;
            }
        }

        for(int i = nums.length - 1;i > begin ; i--) {
            if(sortedArray[i] != nums[i]) {
                end = i;
                break;
            }
        }

        return (end==begin) ? 0 : (end-begin+1);
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 2, 2, 2};
        System.out.println(ShortedUnsortedContinuousArray.findUnsortedSubarray(a));
    }

}
