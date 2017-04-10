package Array;
import java.util.*;

public class IntersectionOfArrays {
	
	public static int[] intersectionOfArrays(int []nums1, int []nums2){
		//Sort the two arrays and then move ahead in each of the array
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> list = new ArrayList<Integer>();
		int n1=0,n2=0;
		while(n1 < nums1.length && n2 < nums2.length){
			if(nums1[n1]==nums2[n2]){
				list.add(nums1[n1]);
				n1++;
				n2++;
			}
			else if(nums1[n1]<nums2[n2]){
				n1++;
			}else{
				n2++;
			}
		}
		int n[] = new int[list.size()];
		for(int i=0;i<list.size();i++){
			n[i]=list.get(i);
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1[]={1,2,2,1};
		int n2[]={2,2};
		int result[] = IntersectionOfArrays.intersectionOfArrays(n1, n2);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
	}

}
