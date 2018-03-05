package Array;

public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        int n=nums.length, max=Integer.MIN_VALUE, curr=0, prev=0, maxLength = 1;
        for(int i=0; i<n; i++){
            prev =i;
            int k=i+1;
            while(k <= n-i) {
                curr += nums[i];
                int currLength = 1;
                for(int j=k; j<n; j++){
                    System.out.println("i "+i+" Curr "+curr+" nums[j] "+nums[j]+" nums[prev] "+nums[prev]);
                    if(nums[j]>nums[i] && nums[j] > nums[prev]) {
                        currLength++;
                        curr = curr + nums[j];
                        if(max < curr){
                            maxLength = currLength;
                            max = curr;
                        }
                    }
                    prev = j;
                }
                curr=0;
                currLength = 1;
                k++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {10, 9};
        System.out.println(LongestIncreasingSubsequence.lengthOfLIS(a));
    }

}
