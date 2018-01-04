package Array;

import java.util.*;

public class DuplicatesII {

    public static boolean containsNearbyDuplicate(int[] nums, int k){
        //Noob method
        int n = nums.length, j=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        //TODO: Improve by sliding window.
        Set<Integer> set = new HashSet<Integer>();
        for(int i =-0;i<n;i++) {
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main (String args[]) {
        int a[] = {1,2,3,2,4};
        System.out.println(DuplicatesII.containsNearbyDuplicate(a, 2));
    }
}
