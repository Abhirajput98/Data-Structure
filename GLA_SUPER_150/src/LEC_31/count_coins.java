package LEC_31;

import java.util.Scanner;

public class count_coins {
    public static void main(String[] args) {

        // String ans="";
        Scanner sc=new Scanner(System.in);
        int n = 3;
        /*char a=' ';
        char b=' ';
        char c=' ';*/
        printcoins1(n,"");
        System.out.println();
        System.out.println(printcoins(n ,""));

    }
    public static void printcoins1(int n,String ans){



        if(n==0  )   {
            System.out.print(ans+" ");
            return;
        }

        printcoins1(n-1,ans+"H");
        printcoins1(n-1,ans+"T");
        /*a= ans.charAt(0);
        b= ans.charAt(1);
        c=ans.charAt(2);*/

    }
    public static int printcoins(int n,String ans){



        if(n==0  )   {
           // System.out.print(ans+" ");
            return 1;
        }

        int a=printcoins(n-1,ans+"H");
        int b=printcoins(n-1,ans+"T");
        return a+b;
        /*a= ans.charAt(0);
        b= ans.charAt(1);
        c=ans.charAt(2);*/

    }
}

