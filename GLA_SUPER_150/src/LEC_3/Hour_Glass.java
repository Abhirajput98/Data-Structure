package LEC_3;

import java.util.Scanner;

public class Hour_Glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int space=n;
        int row=1;
        while(row<=n*2+1){
            int i =1;
            int val=n;
            while(i<=star){
                System.out.print(val+" ");
                val--;
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            if(row<(2*n)/2+1){
                star++;
                space--;
            }
            else {
                star--;
                space++;
            }

            row++;
            System.out.println();

        }
    }
}
