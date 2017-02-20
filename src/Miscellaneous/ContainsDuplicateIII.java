package Miscellaneous;
import java.util.*;

public class ContainsDuplicateIII {

	public static boolean containsDuplicate(int[] nums, int k, int t){
		int n=nums.length;
		for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
            	if((Math.abs((long)nums[i]-nums[j])<=t)&&((j-i)<=k))
                return true;
            }
        }
        return false;
	}
	
	public static void main(String args[]){
		int n[] = {-1,2147483647};
		boolean result = ContainsDuplicateIII.containsDuplicate(n, 1, 2147483647);
		System.out.println(result);
	}
}
