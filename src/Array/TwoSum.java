package Array;
import java.util.*;

public class TwoSum {

	public static void twoSum(int numbers[], int target){
		int n = numbers.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
	        if(map.containsKey(target-numbers[i])){
	        	int index1=map.get(target-numbers[i])+1;
	        	int index2=i+1;
	        	System.out.println("index1="+index1+", index2="+index2);
	        	break;
	        }
	        map.put(numbers[i],i);
	    }
	}
	
	public static void main(String []args){
		int n[]={2,7,11,15};
		TwoSum.twoSum(n, 9);
	}
}
