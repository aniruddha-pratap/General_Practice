package Array;

public class MaxConsOnes {

    public static int findMaxConsecutiveOnes(int []nums) {
        int count = 0, max=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1){
                count++;
                if(max<count) {
                    max=count;
                }
            } else {
                count=0;
            }
        }
        return max;
    }

    public static void main(String args[]) {
       int n[] = {0};
       System.out.println(MaxConsOnes.findMaxConsecutiveOnes(n));
    }
}
