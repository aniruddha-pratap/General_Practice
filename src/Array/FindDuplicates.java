package Array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static List<Integer> findDuplicates(int nums[]){
		List<Integer> list =  new ArrayList<Integer>();
	    int n= nums.length;
	    for(int i=0;i<n;i++){
	        int index = Math.abs(nums[i]);
	        if(nums[index-1]>0){
	            nums[index-1] = -nums[index-1];
	        }else{
	            list.add(Math.abs(nums[i]));
	        }
	    }
	    return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] ={4,3,2,7,8,2,3,1};
		for(int num: FindDuplicates.findDuplicates(nums)){
			System.out.println(num);
		}
	}

}
