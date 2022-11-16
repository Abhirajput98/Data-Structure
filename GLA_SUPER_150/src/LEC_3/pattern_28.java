package LEC_3;

import java.util.Scanner;

public class pattern_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=n-1;
        int star=1;
        int row=1;
        while(row<=n){
            int i =1;
            while(i<=space){
                System.out.print("  ");
                i++;

            }
            int j =1;
            int val=row;
            while(j<=star){
                System.out.print(val+" ");
                if(j<star/2+1){
                    val++;

                }
                else {
                    val--;
                }
                j++;
            }
            System.out.println();
            row++;
            space--;
            star+=2;
        }

    }
}
