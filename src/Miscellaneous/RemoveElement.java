package Miscellaneous;

public class RemoveElement {

	public static int removeElement(int nums[], int val){
		int n=nums.length;
		int j=0;

		for(int i=0;i<n;i++){

			if(nums[i]!=val){

				int temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;

				j++;
			}
		}
		return j;
	}
	
	public static void main(String args[]){
		int n[]={1,2,4,3,3,6,7};
		System.out.println(RemoveElement.removeElement(n, 3));
		for(int i=0;i<6;i++){
			System.out.println(n[i]);
		}
	}
	
}
