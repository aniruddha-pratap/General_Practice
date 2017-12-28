package Array;

public class Move0s {

    public static void moveZeroes(int[] nums) {
        int n = nums.length,j=0;
        for(int i=0; i<n; i++) {
            if(nums[i] != 0){
                if(i != j){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = {1,0,2,3,0,4,5};
        Move0s.moveZeroes(a);
        for(int num: a){
            System.out.println(num);
        }
    }

}
