package Strings;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        //Keep incrementing the fast pointer unless the value at and fast are not equal, then move slow pointer ahead
        //and insert the value of fast pointer at slow pointer.
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j]= nums[i];
            }
        }
        return j+1;
    }

    public static void main(String args[]) {
        int a[] = {1,1,1,2,2,3,4,5,6,7,7,8,9};
        int l = RemoveDuplicates.removeDuplicates(a);
        for(int i=0;i<l;i++){
            System.out.print(a[i]);
        }
    }
}
