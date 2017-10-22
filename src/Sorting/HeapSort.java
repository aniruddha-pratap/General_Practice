package Sorting;

public class HeapSort {
	
	public void BuildHeap(int a[], int n){
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);
	}
	
	public void heapify(int a[], int n, int i) {
        int l = 2*i + 1;  
        int r = 2*i + 2;  
		int largest = 0;        
        if (l < n && a[l] > a[largest])
            largest = l;
        else
        	largest = i;
        if (r < n && a[r] > a[largest])
            largest = r;
 
        if (largest != i) {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;
 
            heapify(a, n, largest);
        }
	}
	
	public void heapsort(int a[]) {
		int n = a.length;
		 
		BuildHeap(a,n);
 
        for (int i=n-1; i>=0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
 
            heapify(a, i, 0);
        }
	}
	
	public static void main(String args[]) {
		HeapSort s = new HeapSort();
		int a[] = {4,10,3,5,1};
		s.heapsort(a);
		for(int i=0;i<a.length;i++){
        	System.out.print(a[i]);
        }
	}
	
}
