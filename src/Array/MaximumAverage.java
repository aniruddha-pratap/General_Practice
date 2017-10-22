package Array;

public class MaximumAverage {
	public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0, maxSum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-k+1;j++){
                sum = sum + nums[j];
            }
            sum = sum/4;
            if(maxSum < sum){
                maxSum = sum;
            }
            sum = 0;
        }
        return maxSum;
    }
	
	public static void main(String args[]){
		int nums[] = {1,12,-5,-6,50,3};
		MaximumAverage.findMaxAverage(nums, 4);
	}
}
