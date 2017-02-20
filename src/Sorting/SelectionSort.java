package Sorting;

public class SelectionSort {
	
	static void selectionSort(int a[]){
		int min=0;
		for(int i =0;i<a.length-1;i++){
			min = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min =j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String args[]){
		int a[]={1,4,2,3,9,5,8,7};
		SelectionSort.selectionSort(a);
	}
	
}
