package Matrix;

public class RangeAddition {

    public static int maxCount(int m, int n, int[][] ops) {
        int row = ops.length, col = ops[0].length;
        int rows = m, cols=n;
        for(int i=0;i<row;i++) {
            if(rows > ops[i][0]) {
                rows = ops[i][0];
            }
            if(cols > ops[i][1]) {
                cols = ops[i][1];
            }
        }
        return rows*cols;
    }

    public static void main(String args[]){
        int ops[][] = {{2,2},{3,3}};
        System.out.println(RangeAddition.maxCount(3,3,ops));
    }
}
