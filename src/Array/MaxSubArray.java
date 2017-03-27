package Array;
import java.util.*;

public class MaxSubArray {

	public static int maxSubArray(int[] nums) {
		int n =nums.length;
		int sum = 0;
		for(int i=1;i<n;i++){
			if(nums[i-1]+nums[i]>sum){
				sum = sum + nums[i-1]+nums[i];
			}
		}
		return sum;        
	}
	
	public static void main(String[] args) {
		int n[] ={1,2,3,4,5,6};
		System.out.println(MaxSubArray.maxSubArray(n));
	}

}
