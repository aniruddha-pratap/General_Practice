package Array;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0 , end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String args[]) {
        int n[] = {1,3,5,6};
        System.out.println(SearchInsert.searchInsert(n, 7));
    }
}
