package Array;

public class ConsecutiveOnes {

	 public static int findMaxConsecutiveOnes(int[] nums) {
	        int n = nums.length;
	        int sum=0, max=0;
	        if(n==1){
	        	if(nums[0]==1){
	        		return 1;
	        	}
	        }
	        for(int i=1;i<n;i++){
	            if ((nums[i] == 1) && (nums[i-1] == nums[i])){
	                sum = sum + 1;
	                if (max<sum){
	                    max=sum;
	                }
	            }else{
	              sum = 0;
	            }
	        }
	        return max>0 ? max+1 : 0;
	}
	 
	 public static void main(String args[]){
		 int[] nums = {0,1};
		 System.out.println(ConsecutiveOnes.findMaxConsecutiveOnes(nums));
	 }
}
