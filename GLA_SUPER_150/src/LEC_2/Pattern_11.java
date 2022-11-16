package LEC_2;

import java.util.Scanner;

public class Pattern_11 {
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
                if(j<=star/2){

                    val++;

                }
                else {
                    val--;
                }
                j++;

            }
            row++;
            star+=2;
            System.out.println();
            space--;
        }
    }
}
