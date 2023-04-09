package LEETCODE;

import java.util.Arrays;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        int [][]matrix = {{1,2},{1,3}};
        int [] arr = new int [matrix.length*(matrix[0].length)];
       // System.out.println(Arrays.toString(arr));
        int k=0;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[k]=matrix[i][j];
                k++;
            }
        }
        //   System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
