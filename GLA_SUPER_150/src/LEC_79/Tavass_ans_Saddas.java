package LEC_79;

import java.util.Scanner;

public class Tavass_ans_Saddas {
    public static void main(String[] args) {
        System.out.println(index("7474774"));

        Scanner sc = new Scanner(System.in);
        String s =  sc.next();

    }
    public static int index(String str){
        int n = str.length();
        int x= (1<<n)-2;
        int y=0;
        int pos=0;
        for(int i =str.length()-1;i>=0;i--){
            if(str.charAt(i)=='7'){
                y=y+(1<<pos);
            }
            pos++;
        }
        return x+y+1;

    }
}
