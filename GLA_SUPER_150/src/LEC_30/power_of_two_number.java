package LEC_30;
import  java.util.Scanner;

public class power_of_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println(power(a,b));

    }
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        /*if( a==0){
            return 0;
        }*/
        int ans=power(a,b-1);
        return a*ans;
    }
}
