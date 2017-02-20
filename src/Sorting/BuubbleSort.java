package Sorting;

public class BuubbleSort {

	static void bubbleSort(int []s){
		for(int j=s.length-1; j>=0; j--){
			for(int i=0;i<j;i++){
				if(s[i]>s[i+1]){
					int temp = s[i];
					s[i]=s[i+1];
					s[i+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);	
		}
		
	}
	public static void main(String args[]){
		int a[]={1,5,8,6,9,2,4,7};
		BuubbleSort.bubbleSort(a);
	}
}
