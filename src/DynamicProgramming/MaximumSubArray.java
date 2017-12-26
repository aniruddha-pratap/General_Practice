package DynamicProgramming;

public class MaximumSubArray {

    //Assumption: It`s a non-empty array

    public static int maxSubArray(int[] nums) {

        //Very crude, first solution.Lets improve upon this.

        /*
         int n = nums.length, sum=Integer.MIN_VALUE;
         for(int i =0;i<n;i++){
             int initial = nums[i];
             sum = Math.max(sum, initial);
             for(int j=i+1;j<n;j++){
                 initial = initial + nums[j];
                 sum = Math.max(sum, initial);
             }
             initial = 0;
         }
         */

        //Improved subProblem solution could be to find the max subArray from 0 to current index and traverse till last
        //index.

        /*
         int max = nums[0];
         int subProblem[] = new int[nums.length];
         subProblem[0] = nums[0];
         for(int i=1;i<nums.length; i++){
            subProblem[i] = nums[i] +(subProblem[i-1] > 0 ? subProblem[i-1] : 0);
            max = Math.max(max, subProblem[i]);
         }
         return max;
         */


        //Further improve by reducing the memory used.

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }

    public static void main(String args[]) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSubArray.maxSubArray(a));
    }
}
