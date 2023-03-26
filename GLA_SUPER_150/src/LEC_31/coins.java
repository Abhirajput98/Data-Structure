package LEC_31;
import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
       // String ans="";
        Scanner sc=new Scanner(System.in);
        int n = 3;
        /*char a=' ';
        char b=' ';
        char c=' ';*/
        printcoins(n ,"");

    }
    public static void printcoins(int n,String ans){



        if(n==0  )   {
           System.out.print(ans+" ");
            return;
        }

        printcoins(n-1,ans+"H");
        printcoins(n-1,ans+"T");
        /*a= ans.charAt(0);
        b= ans.charAt(1);
        c=ans.charAt(2);*/

    }
}
