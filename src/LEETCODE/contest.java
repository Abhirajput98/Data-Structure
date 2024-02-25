package LEETCODE;

public class contest {
    public static void main(String[] args) {

    }
    public static int[][] modifiedMatrix(int[][] matrix) {
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=max(matrix,j);
                }
            }
        }
        return matrix;

    }
    public static int max(int [][] matrix, int col){
        int m = 0;
        for(int i =0;i<matrix.length;i++){
            m=Math.max(matrix[i][col],m);
        }
        return m;
    }
}
