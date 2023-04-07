package LEETCODE;

import java.util.Scanner;

public class pow_n {
    public static void main(String[] args) {
        int n =64;
        System.out.println(pow(n,0,4));
    }
    public static int  pow(int n,int i ,int s){
        if(s==n){
            return i;
        }
        return pow(n,i+1,s*i);

    }
}
