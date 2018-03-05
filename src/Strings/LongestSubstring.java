package Strings;
import java.util.*;

public class LongestSubstring {
	
	static int longestSubstring(String s){

		/*HashMap<Character, Integer> str = new HashMap<Character, Integer>();
 		int n =s.length();
 		int lenSubstr = 0;
 		String result = "";
		for(int i=0;i<n;i++){
			if(str.containsKey(s.charAt(i))){
				i=str.get(s.charAt(i));
				str.clear();
			}else{
				str.put(s.charAt(i), i);
			}
			if(lenSubstr < str.size()){
				lenSubstr = str.size();
				result = str.keySet().toString();
			}
		}
		//System.out.println(lenSubstr);
		return result;*/

		int max=0, i=0, j=0, n=s.length();
		Set<Character> set = new HashSet<>();

		while(i<n) {

			if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
				max = Math.max(max, set.size());
				i++;
			}
			else {
				set.remove(s.charAt(j));
				j++;
			}
		}

		return max;
	}

	public static void sorColors (int nums[]){
	    int countZero = 0, countOne = 0;
	    for(int i=0;i<nums.length;i++) {
	        if(nums[i] ==0){
	            countZero++;
            } else if (nums[i] == 1){
	            countOne++;
            }
        }
        for(int i=0;i<nums.length;i++){
	        if(countZero>0){
	            nums[i]=0;
	            countZero--;
            } else if (countOne>0){
	            nums[i]=1;
	            countOne--;
            } else {
                nums[i]=2;
            }
        }
    }
	
	public static void main(String []args){
		//int a = LongestSubstring.longestSubstring("aau");
		//System.out.println(a);
        int a[] = {0,2,1,1,0,2};
        LongestSubstring.sorColors(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
	}
}



