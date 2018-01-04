package Array;
import java.util.*;

public class KDiffPairs {
	
	public static int kDiffPairs(int nums[], int k){
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int ret = 0;
        for(int n : nums){
        /* if smaller matched value exists */
            if(map.containsKey(n-k) && !map.get(n-k)){
                map.put(n-k,true);
                ret++;
            }
        /* if larger matched value exists */
            if(map.containsKey(n+k) && (!map.containsKey(n) || !map.get(n))){
                map.put(n, true);
                ret++;
            }
        /* if current value has not yet been added*/
            if(!map.containsKey(n)){
                map.put(n, false);
            }
        }
        return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]={3, 1, 4, 1, 5, 3};
		System.out.println(KDiffPairs.kDiffPairs(n, 2));
	}

}
