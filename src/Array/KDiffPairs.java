package Array;
import java.util.*;

public class KDiffPairs {
	
	public static int kDiffPairs(int nums[], int k){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> uniquePair = new HashMap<Integer, Integer>();
		int i=0,j=0;
		for(i=0;i<nums.length;i++){
			if(map.containsKey(Math.abs(k+nums[i]))){
				int ind1 = map.get(Math.abs(k+nums[i]));
				int ind2 = i;
				System.out.println(ind1 + " = "+ nums[ind1] + " , " + ind2 + " = " + nums[ind2]);
			}
			map.put(nums[i], i);
		}
		return j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]={3, 1, 4, 1, 5};
		System.out.println(KDiffPairs.kDiffPairs(n, 2));
	}

}
