package Miscellaneous;

import java.util.Arrays;

public class MissingNumber {

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		for(int i=1;i<n;i++){
			if(nums[i]-nums[i-1]>1){
				return nums[i]-1;
			}
		}
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {0,1,3};
		System.out.println(MissingNumber.missingNumber(n));
	}

}
