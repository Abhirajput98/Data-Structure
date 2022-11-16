package LEC_3;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        int row = 1;
        int space = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        while (row <= 2*n-1) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;

            }
            if(row<n){

                space = space + 2;
                star--;

            }
            else {
                space=space-2;
                star++;
            }
            System.out.println();
            row++;
        }
    }
}
