package LEC_2;
import java.util.Scanner;

public class pattern_double_side_arrow {
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
            int j=1;
            int val;
            if(row<n/2){
                 val=row;


            }
            else{
                val=n-row+1;
            }

            while(j<=star){

                System.out.print(val+" ");
                j++;
            }

            if(row<n/2+1){
                space-=2;
                star++;
            }
            else{
                space+=2;
                star--;
            }
            row++;
            System.out.println();
        }

    }
}
