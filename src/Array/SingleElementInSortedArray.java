package Array;

public class SingleElementInSortedArray {

    public static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            System.out.println("Start: "+start+" end: "+end+" mid: "+mid);
            if(nums[mid] == nums[mid+1] && mid%2==0){
                start = mid+1;
            } else if( nums[mid] == nums[mid-1] && mid%2==1) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return nums[start];
    }

    public static void main(String args[]) {
        int a[] = {1,1,2,3,3,4,4};
        System.out.println(SingleElementInSortedArray.singleNonDuplicate(a));
    }
}
