package Lec_40;

import java.util.Stack;

public class Maximum_rectangle {
    public static void main(String[] args) {
        char[][]  matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }
        public static int maximalRectangle(char[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;

            int[][] arr = new int[row][col];
            for(int i = 0; i < row; ++i){
                for(int j = 0; j < col; ++j){
                    if(matrix[i][j] == '1')
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
            int[] temp = new int[col + 1];
            int result = Integer.MIN_VALUE;
            int height = 0;
            // int[] temp = new int[arr[0].length + 1];
            for(int i = arr.length - 1; i >= 0; --i){
                for(int j = 0; j < arr[0].length; ++j){
                    temp[j] = arr[i][j] == 1 ? temp[j] + 1 : 0;
                }
                height = largestRectangleArea(temp);
                result = Math.max(result, height);
            }
            // System.out.println(result);
            return result;

        }
        public static int largestRectangleArea(int[] arr){
            Stack<Integer> st = new Stack<>();
            int ans = 0;
            for(int i = 0; i < arr.length; ++i){
                while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                    int h = arr[st.pop()];
                    int r = i;
                    if(st.isEmpty()){
                        int a = h * r;
                        ans = Math.max(ans, a);
                    }
                    else{
                        int l = st.peek();
                        int a = h * (r - l - 1);
                        ans = Math.max(ans, a);
                    }
                }
                st.push(i);
            }
            return ans;
        }

}
