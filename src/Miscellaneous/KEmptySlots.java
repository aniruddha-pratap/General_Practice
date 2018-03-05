package Miscellaneous;

import java.util.Arrays;

public class KEmptySlots {

    public static int kEmptySlots(int[] flowers, int k) {

        if (flowers == null || flowers.length == 0 || k + 2 > flowers.length) {
            return -1;
        }

        int length = flowers.length;
        int[] day = new int[length];

        for (int i = 0; i < length; i++) {
            int index = flowers[i] - 1;
            day[index] = i + 1;
        }

        int res = Integer.MAX_VALUE;
        int start = 0, end = k + 1;

        for (int i = 1; i < length; i++) {

            int max = Math.max(day[start], day[end]);
            if (day[i] <= max) {
                if (i == end) {
                    res = Math.min(max, res);
                }
                start = i;
                end = start + k + 1;
                if (end >= length) break;
            }
        }

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }


    public static void main(String[] args) {
        int a[] = {3,1,5,4,2};
        System.out.println(KEmptySlots.kEmptySlots(a,1));
    }




}
