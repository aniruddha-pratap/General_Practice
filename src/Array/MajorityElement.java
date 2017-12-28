package Array;
import java.util.*;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
		int n = nums.length;
		int max=0,count=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			if(map.containsKey(nums[i])){
				count = map.get(nums[i])+1;
				map.replace(nums[i], count);
				if(count > n/2){
					max = nums[i];
				}
			}else{
				map.put(nums[i], 1);
			}
		}
		// can also be solved like this
		/*int max=0;
		Arrays.sort(nums);
		max = nums[nums.length/2];*/
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n []={1,1,3,4,9,7,7,7,8,5,2,2,2};
		System.out.println(MajorityElement.majorityElement(n));
	}

}
