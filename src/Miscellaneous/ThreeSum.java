package Miscellaneous;
import java.util.*;

public class ThreeSum {
	
	static List<List<Integer>> threeSum(int nums[], int target){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> sumList = new ArrayList<Integer>();
		Arrays.sort(nums);
		int i=0,j=0,k=nums.length-1;
		for(i=0;i<nums.length;i++){
			j = i+1;
			while(j<k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == target){
					sumList.add(nums[i]);
					sumList.add(nums[j]);
					sumList.add(nums[k]);
					list.add(sumList);
					while(j<k && nums[k] == nums[k-1]){
						k--;
					}
					while(j<k && nums[j] == nums[j+1]){
						j++;
					}
					j++;
					k--;
				}else if(sum>target){
					k--;
				}else{
					j++;
				}
			}
		}
		System.out.println("Length is "+ list.size());
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> l= ThreeSum.threeSum(n, 0);
		for(int i = 0;i<l.size();i++){
			
		}
	}

}
