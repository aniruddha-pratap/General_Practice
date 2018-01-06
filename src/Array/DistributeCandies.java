package Array;


import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int candy: candies){
            set.add(candy);
        }
        return Math.min(candies.length/2, set.size());
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        System.out.println(DistributeCandies.distributeCandies(a));
    }

}
