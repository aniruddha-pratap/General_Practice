package Array;

public class RightRotateArray {

	public static int[] reverseArray(int []num, int start, int end){
		while(start<end){
			int temp = num[end];
			num[end] = num[start];
			num[start]= temp;
			start++;
			end--;
		}
		return num;
	}
	
	public static int[] rotateArray(int nums[], int k){
		k = k % nums.length;
		nums = reverseArray(nums, 0 , nums.length - 1);
		nums = reverseArray(nums, 0 , k - 1);
		nums = reverseArray(nums, k , nums.length - 1);
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]={1,2,3,4,5,6,7};
		int result[] = RightRotateArray.rotateArray(n, 3);
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]);
		}
	}
}
