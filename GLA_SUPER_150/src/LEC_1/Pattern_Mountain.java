package LEC_1;
import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i=0;
        int j=1;

        while(i<n){
            int a= sc.nextInt();
            int k=0;
            int l=0;
            int s=1;
            int c=0;
            int d=0;
            int b= sc.nextInt();
            if(k<=a){
                k=k+s;
                c++;
            }
            else if (l<=b) {
                l=l+s;
                d++;
            }
            s++;
            i++;
            System.out.println( c+" " +d );



        }

        }
    }

