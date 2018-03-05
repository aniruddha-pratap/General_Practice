package Array;

public class FindPeak {

    public static int findPeakElement(int[] nums) {
        //O(n) solution
        int n = nums.length;

        for(int i=1; i<n; i++) {
            if(nums[i] < nums[i-1])
                return i-1;
        }
        return 0;
    }

    public static int findPeakElements(int[] nums) {
        //O(log n) solution
        int low=0,high=nums.length-1;
        while(low<high) {
            int mid= low+(high-low)/2;
            if(nums[mid+1] > nums[mid])
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }

    public static void main(String[] args) {
        int a[] = {1, 2};
        System.out.println(FindPeak.findPeakElements(a));
    }
}
