package LEC_52;

import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int n = sc.nextInt();
            int [] arr= new int[a];
            for(int i =0;i<a;i++){
                arr[i]= sc.nextInt();
            }

        }

    }
    public  static  int  MinimumPages(int []page,int nos ){
        int lo=0;
        int hi=0;
        for(int val : page){
            hi=hi+val;
        }
        while(lo<=hi){
            int mid = (lo+hi)/2;

        }
        return  1;
    }
}
