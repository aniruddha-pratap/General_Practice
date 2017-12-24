package Array;

import java.util.Arrays;

public class SingleDuplicate {

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1; i++) {
            int target = nums[i];
            int start = i+1, end = nums.length - 1;
            while((start <= end)){
                int mid = start + (end-start)/2;
                if(target == nums[mid]) {
                    return nums[mid];
                } else if(nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            start = i;
            end = nums.length -1;
        }

        return 0;
    }

    public static void main(String args[]) {
        int a[] = {1,9,8,5,9,2,6,12,14,16,18};
        System.out.println(SingleDuplicate.findDuplicate(a));
    }
}
