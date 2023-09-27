package LEC_15;

public class print_2d_spiral {
    public static void main(String[] args) {
       // int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int [][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        PrintSpiral(arr);
    }
   public static void PrintSpiral(int[][] arr) {
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int total_elements= arr.length*arr[0].length;
        int count=0;
        while (total_elements!=count) {
            for (int i = minc; i <= maxc && total_elements!=count; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && total_elements!=count ; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && total_elements!=count; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && total_elements!=count; i--) {
                System.out.print(arr[i][minc] + " ");
                count++;
            }
            minc++;
        }
    }
}
