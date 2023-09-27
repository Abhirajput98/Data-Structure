package LEC_15;
import java.util.Scanner;

public class rotate_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("enter the size of coloms");
        // int  m=sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }
        rotate(arr, n, n);
    }

    public static void rotate(int[][] arr, int n, int m) {
        int minr = 0;
        int maxr = m - 1;
        int minc = 0;
        int maxc = n - 1;
      //  int elements = n * m;
        int w = 0;
        while (w <= n && minr<=maxr) {


            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[i][maxr] + " ");

            }
            System.out.println();
            maxr--;
            w++;


        }
    }
}

