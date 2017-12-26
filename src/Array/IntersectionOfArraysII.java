package Array;

import java.util.*;

public class IntersectionOfArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>list = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1=0,n2=0;
        while(n1 < nums1.length && n2 < nums2.length){
            if(nums1[n1]==nums2[n2]){
                list.add(nums1[n1]);
                n1++;
                n2++;
            }
            else if(nums1[n1]<nums2[n2]){
                n1++;
            }else{
                n2++;
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String args[]) {
        int nums1[] = {1, 2, 2, 1}, nums2[] = {2, 2};
        int res[] = IntersectionOfArraysII.intersect(nums1, nums2);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
