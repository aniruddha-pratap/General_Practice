package Miscellaneous;
import java.util.*;

public class TopKFrequentElements {
	
	public static List<Integer> topKElements(int nums[], int k){
		//Assuming only positive numbers
	    int max = Integer.MIN_VALUE;

        List<Integer> list = new ArrayList<>();

		for(int i=0;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}

        int temp[] = new int[max];

		for(int i=0;i<nums.length;i++){
			temp[max - nums[i]]++;
            System.out.println("Nums at "+(max-nums[i])+" "+temp[max-nums[i]]);
        }

		int tempMax = Integer.MIN_VALUE;
		for(int i=0;i<k;i++){
		    int maxIndex =0;
            for(int j =0;j<temp.length;j++) {
                if(tempMax < temp[j]) {
                    maxIndex = j;
                    tempMax = temp[j];
                }
            }
            list.add(max - maxIndex);
            temp[maxIndex] = -1;
            tempMax = Integer.MIN_VALUE;
        }
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {1,3,2,4,1,2,1,4,2,3,4,1,2,1,4};
		List<Integer> l = TopKFrequentElements.topKElements(n, 2);
		for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
	}

}
