package Array;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        int n=nums.length, max=Integer.MIN_VALUE;
        for(int i=0; i<k; i++) {
            int currIndex = 0;
            for(int j=i;j<n;j++){
                if( max < nums[j]){
                    max = nums[j];
                    currIndex = j;
                }
            }
            nums[currIndex] = nums[i];
            nums[i] = max;
            currIndex = 0;
            max = Integer.MIN_VALUE;
        }
        return nums[k-1];
    }

    public static void main(String[] args) {
        int a[] = {-3,-2,-1,-5,-6,-4};
        System.out.println(KthLargestElement.findKthLargest(a, 2));
    }
}
