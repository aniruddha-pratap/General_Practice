package Miscellaneous;
import java.util.*;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int []nums, int k){
		/**Map<Integer, Integer> m = new HashMap<Integer,Integer>();
		int n = nums.length;
		int temp = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(m.containsKey(nums[i])){
				temp = m.get(nums[i]);
				if(Math.abs(temp-i)<min){
					min = Math.abs(temp-i);
					m.replace(nums[i], i);
				}
				System.out.println(min);
			}else{
				m.put(nums[i], i);
			}
		}
		if(min<=k){
			return true;
		}else{
			return false;
		}**/
		
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		    for (int i = 0; i < nums.length; i++) {
		        if (map.containsKey(nums[i])) {
		        	System.out.println(i - map.get(nums[i]));
		            if (i - map.get(nums[i]) <= k) 
		            	return true;
		        }
		        map.put(nums[i], i);
		    }
		    return false;
	}
	
	public static void main(String args[]){
		ContainsDuplicate c = new ContainsDuplicate();
		int n[] ={1,0,1,1};
		boolean result = c.containsDuplicate(n, 1);
		System.out.println(result);
	}
}
