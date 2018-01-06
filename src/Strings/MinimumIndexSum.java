package Strings;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MinimumIndexSum {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> restaurant = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<list1.length;i++) {
            map.put(list1[i], i);
        }
        for(int i=0;i<list2.length;i++) {
            if(map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                if(sum < min) {
                    restaurant.clear();
                    restaurant.add(list2[i]);
                    min=sum;
                } else if(sum == min){
                    restaurant.add(list2[i]);
                }
            }
        }
        String result[] = new String[restaurant.size()];
        for(int j=0;j<restaurant.size();j++) {
            result[j] = restaurant.get(j);
        }
        return result;
    }

    public static void main(String[] args) {
        String list1[] = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String list2[] = {"KFC", "Shogun", "Burger King"};
        String res[]=MinimumIndexSum.findRestaurant(list1, list2);
        for(int i =0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
