package LEETCODE;

import java.util.Arrays;

public class The_K_Weakest_Rows_in_a_Matrix {
    public static void main(String[] args) {
        int [][]mat =
                {{1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}};
        int [] arr = new int [mat.length];
        int k =0;
        for(int i =0;i<mat.length;i++){
            int c=0;
            for(int j =0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            arr[k]=c;
            k++;
        }
       System.out.println(Arrays.toString(arr));
        int [] ans = arr;

        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        for(int i=0;i< ans.length;i++){
            for(int j=0;j< arr.length;j++){
                if(ans[i]==arr[j]){
                    System.out.println(j);

                }
            }
        }

    }
}
