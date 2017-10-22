package Array;

public class MergeSort {
 
    public int[] mergeBoth(int b[], int a[]) 
    {	
    	int c, d = b.length - 1;
        int i = a.length;
        int j = 0;
        int k = 0;
    
        for (c = d; c >= 0; c--) 
        {
            if (b[c] != 0) 
            {
                b[d] = b[c];
                d--;
            }
        }
        
        while (k < b.length) 
        {
            if ((i < b.length && b[i] <= a[j]) || (j == a.length)) 
            {
                b[k] = b[i];
                k++;
                i++;
            } 
            else
            {
                b[k] = a[j];
                k++;
                j++;
            }
        }
        return b;
    }
 
    
    public static void main(String[] args) 
    {
        MergeSort merge = new MergeSort();
        int b[] = {1,2,3,4,5,0,0,0,0};
        int a[] = {6,7,8,9};
        b = merge.mergeBoth(b, a);
        for(int i =0;i<b.length;i++){
        	System.out.print(b[i]);
        }
    }
}
