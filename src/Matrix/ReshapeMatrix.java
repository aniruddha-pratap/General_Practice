package Matrix;

public class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] nums, int r, int c) {

        int res[][] = new int [r][c];
        int row = nums.length;
        int columns = nums[0].length;
        if(r*c != row*columns) {
            return nums;
        }
        int resultRow=0, resultCol = 0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<columns;j++){
                res[resultRow][resultCol] = nums[i][j];
                resultCol++;
                if(resultCol == c){
                    resultCol=0;
                    resultRow++;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int in[][] = {{1,2,3},{3,4,3}};
        int r=3, c=2;
        in = ReshapeMatrix.matrixReshape(in, r,c);
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(in[i][j]);
            }
            System.out.println();
        }

    }
}
