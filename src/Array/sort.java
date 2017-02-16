package Array;

public class sort {

	/**private void findUnsortedSequence(int [] arr){
		/**int lEnd = leftEnd(n);
		if(lEnd>=n.length-1){
			return;
		}
		int rBegin = rightBegin(n);
		int min=lEnd;
		int max=rBegin;
		for(int i=lEnd+1;i<rBegin;i++){
			if(n[i]<n[min]){
				min =i;
			}
			if(n[i]>n[max]){
				max =i;
			}
		}
		
		int left = moveLeft(n,min,lEnd);
		int right = moveRight(n,max,rBegin);
		System.out.println(left+" "+right);
	}
	
	public int leftEnd(int []n){
		for(int i=1;i<n.length;i++){
			if(n[i]<n[i-1]){
				return i-1;
			}
		}
		return n.length-1;
	}
	
	public int rightBegin(int []n){
		for(int i=n.length-2;i>=0;i--){
			if(n[i]>n[i+1]){
				return i+1;
			}
		}
		return 0;
	}
	
	public int moveLeft(int n[], int min, int left){
		int temp = n[min];
		for(int i=left-1;i>=0;i--){
			if(n[i]<=temp){
				return i+1;
			}
		}
		return 0;
	}
	
	public int moveRight(int n[], int max, int right){
		int temp = n[max];
		for(int i=right;i<n.length;i++){
			if(n[i]>=temp){
				return i-1;
			}
		}
		return n.length-1;
	}
		if(arr == null || arr.length == 0) return;

	    int m = 0, min = findMinVal(arr);
	    int n = arr.length - 1, max = findMaxVal(arr);

	    while(arr[m] < min)
	    {
	        m ++;
	    }

	    while(arr[n] > max)
	    {
	        n --;
	    }

	    System.out.println(m);
	    System.out.println(n);
	}

	private int findMinVal(int[] arr)
	{
	    int min = Integer.MAX_VALUE;
	    for(int i = 1; i < arr.length; i++)
	    {
	        if(arr[i] < arr[i-1] && arr[i] < min)
	        {
	            min = arr[i];
	        }
	    }

	    return min;
	}

	private int findMaxVal(int[] arr)
	{
	    int max = Integer.MIN_VALUE;
	    for(int i = arr.length - 2; i >= 0; i--)
	    {
	        if(arr[i] >= arr[i+1] && arr[i] > max)
	        {
	            max = arr[i];
	        }
	    }

	    return max;
	}	**/
	
	
	   public int solution(int[] A) {
	        // write your code in Java SE 8
		   if(A == null || A.length == 0) return 0;

		    int a = 0, min = leftEnd(A);
		    int len = A.length - 1, max = rightBegin(A);
		    /**if(a>=A.length){
		    	return 0;
		    }**/
		    if(min == Integer.MAX_VALUE){
		    	return 0;
		    }
		    while(A[a] < min)
		    {
		        a ++;
		    }

		    while(A[len] > max)
		    {
		        len --;
		    }
		    
		    System.out.println(a);
		    System.out.println(len);
	        /**int lEnd = leftEnd(A);
	        int a = 0;
	        int len = A.length-1;
	        if(lEnd >=A.length){
	            return 0;
	        }
	        int rBegin = rightBegin(A);
	        
	        while(A[a]>lEnd){
	            a++;
	        }
	        
	        while(A[len]>rBegin){
	            len--;
	        }
	        System.out.println(a);
	        System.out.println(len);**/
	        return len-a+1;
	    }
	    
	    private int leftEnd(int []n){
	        int len = n.length;
	        int min = Integer.MAX_VALUE;
	        for(int i=1;i<len;i++){
	            if(n[i] < n[i-1] && n[i] < min){
	                min = n[i];
	            }
	        }
	        return min;
	    }
	    
	    private int rightBegin(int []n){
	        int len = n.length;
	        int max = Integer.MIN_VALUE;
	        for(int i = len-2; i>=0; i--){
	            if(n[i] >= n[i+1] && n[i] > max){
	                max = n[i];
	            }
	        }
	        return max;
	    }
	    
	
	
	public static void main(String args[]){
		sort s = new sort();
		int n[] = {1,2,6,5,5,8,9};
		int a = s.solution(n);
		System.out.println(a);
	}
}
