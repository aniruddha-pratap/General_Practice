package Array;

import java.util.Arrays;

public class MinMoves {
	
	public static int minMoves(int[] nums) {
	     Arrays.sort(nums);   
	     int min = nums[0];
	     //Replacing arrays.sort by the code below improves performance
	     /*for(int n:nums){
	    	 min = Math.min(n, min);
	     }*/
	     int moves = 0;
	     for(int n : nums){
	    	 moves = moves + (n-min);
	     }
	     return moves;
    }
	
	public static void main(String args[]){
		int nums[]={1,2,3};
		System.out.println(MinMoves.minMoves(nums));
	}
}
