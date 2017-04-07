package Array;
import java.util.*;

public class DisappearedNumbers {

	public static List<Integer> disappearedNumbers(int nums[]){
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
	        int index = Math.abs(nums[i]) - 1;
	        if(nums[index] > 0) {
	           nums[index] = -nums[index];
	        }
	    }
	        
	    for(int i = 0; i < nums.length; i++) {
	       	if(nums[i] > 0) {
	            l.add(i+1);
	         }
	    }
		return l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n[] = {4,3,2,7,8,2,3,1};
			List<Integer> l = disappearedNumbers(n);
			for(int item:l){
				System.out.print(" " + item);
			}
	}

}
