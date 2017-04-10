package Array;

public class HouseRobber {

	//DP Solution
	public static int houseRobberDP(int nums[]){
		 if(nums==null||nums.length==0)
		        return 0;
		 
		    if(nums.length==1)
		        return nums[0];
		 
		    int[] dp = new int[nums.length];
		    dp[0]=nums[0];
		    dp[1]=Math.max(nums[0], nums[1]);
		 
		    for(int i=2; i<nums.length; i++){
		        dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
		    }
		 
		    return dp[nums.length-1];
	}
	
	//OddEven Solution
	public static int houseRobber(int nums[]){
		if(nums.length == 0){
            return 0;
        }
        int sumEven =0, sumOdd=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sumEven += nums[i];
                sumEven = Math.max(sumEven, sumOdd);
            }else{
                sumOdd += nums[i];
                sumOdd = Math.max(sumEven, sumOdd);
            }
        }
        
        return Math.max(sumEven, sumOdd);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {10,2,3,4,8,20};
		System.out.println(HouseRobber.houseRobber(n));
	}

}
