package Array;

import java.util.Arrays;

public class ShuffleArray {

    public int nums[];

    public ShuffleArray(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] rand = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int r = (int) (Math.random() * (i+1));
            rand[i] = rand[r];
            rand[r] = nums[i];
        }
        return rand;
    }

    public static void main(String[] args) {
        int []a={1,2,3};
        ShuffleArray n = new ShuffleArray(a);
        System.out.println(Arrays.toString(n.shuffle()));
        System.out.println(Arrays.toString(n.shuffle()));
        System.out.println(Arrays.toString(n.shuffle()));
        System.out.println(Arrays.toString(n.shuffle()));
        System.out.println(Arrays.toString(n.reset()));
    }
}
