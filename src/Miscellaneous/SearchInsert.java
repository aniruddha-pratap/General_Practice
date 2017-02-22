package Miscellaneous;

public class SearchInsert {
	
	public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int j=0;
        int count = 0;
        /**for(int i=0;i<n;i++){
            if(nums[i] == target){
                return i;
            }else{
                if(nums[i]>=target){
                    return i;
                }else{
                	count++;
                }
            }
        }
        if(count == n){
        	return n;
        }else{
        	return 1;
        }**/
        
        while(j<=n){
        	if(nums[j]>=target){
        		return j;
        	}
        	if(nums[n-1]<target){
        		return n;
        	}
        	j++;
        	n--;
        }
        return 1;
    }
/**Best solution to search for a number in a sorted array 
 * is to skip the elements of the array that are smaller than the number
 * 
 *  int low = 0, high = nums.length;
    while(low < high) {
        int mid = low + (high - low) / 2;
        if(nums[mid] < target)
            low = mid + 1;
        else
            high = mid;
    }
    return low;
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {2,4,6,8};
		System.out.println(SearchInsert.searchInsert(n, 9)); 
	}

}
