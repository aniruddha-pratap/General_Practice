package Array;
import java.util.*;

public class TwoSum {

	public static int[] twoSum(int numbers[], int target){
		int n = numbers.length;
		int nums[] = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
	        if(map.containsKey(target-numbers[i])){
	        	nums[0] = map.get(target-numbers[i]) + 1;
	        	nums[1] = i+1;
	        	return nums;
	        }
	        map.put(numbers[i],i);
	    }
	    return nums;
	}
	
	public static void main(String []args){
		int n[]={2,11,15,7};
		int a[] = TwoSum.twoSum(n, 9);
		System.out.println(a[0] + " " + a[1]);
	}
}
