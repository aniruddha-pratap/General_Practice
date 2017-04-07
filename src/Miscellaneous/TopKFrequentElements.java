package Miscellaneous;
import java.util.*;

public class TopKFrequentElements {
	
	public static List<Integer> topKElements(int nums[], int k){
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map =  new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i])+1);
			}else{
				map.put(nums[i], 1);
			}
		}
		List<Integer> sortedList = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {1,1,1,2,2,3}; 
		TopKFrequentElements.topKElements(n, 2);
	}

}
