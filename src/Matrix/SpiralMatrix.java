package Matrix;
import java.util.*;

public class SpiralMatrix {

    public static List<Integer> spiralMatrix(int [][]nums) {
        List<Integer> result= new ArrayList<>();

        int rowEnd = nums.length-1, colEnd = nums[0].length-1;
        int rowBegin =0, colBegin =0;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                result.add(nums[rowBegin][j]);
            }
            rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                result.add(nums[j][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    result.add(nums[rowEnd][j]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    result.add(nums[j][colBegin]);
                }
            }
            colBegin ++;
        }


        return result;
    }

    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> l = SpiralMatrix.spiralMatrix(a);
        for(int i=0; i<l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

}
