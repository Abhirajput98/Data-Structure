package LEC_1;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4}};
        System.out.println( matrixReshape(arr,1,4));


    }
        public static int[][] matrixReshape(int[][] mat, int r, int c) {
            int m = mat.length, n = mat[0].length;
            if (m * n != r * c) return mat;
            int count = 0;
            int[][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = mat[count / n][count % n];
                    count++;
                }
            }
            return arr;
        }
    }



