package Array;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int n = nums.length, sumLeft = 0, sumRight = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++){
                sumLeft += nums[j];
            }
            for(int j=i+1;j<n;j++){
                sumRight += nums[j];
            }
            if(sumLeft == sumRight) {
                return i;
            }
            sumLeft = 0; sumRight = 0;
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = {-1, -1, -1, 0, 1 ,1};
        System.out.println(PivotIndex.pivotIndex(a));
    }
}
