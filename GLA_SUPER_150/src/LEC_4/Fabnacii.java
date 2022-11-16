package LEC_4;
import java.util.Scanner;
public  class Fabnacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int n1=0;
        int n2=1;
        int n3;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=row){
                System.out.print(n1+" ");
                n3=n1+n2;
                n1=n2;
                n2=n3;
                i++;
            }
            row++;
            System.out.println();

        }

        }

    }
