package LEETCODE;

import java.util.Arrays;

public class Counting_Bits {
    public static void main(String[] args) {
        int n =5;
      // System.out.println(count1(3));
        int [] arr = new  int [n+1];
        for(int i =0;i<=n;i++){
            arr[i]=count1(i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public  static  int count1(int n){
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem=n%2;
            sum=sum+rem*mul;
            n=n/2;
            mul=mul*10;

        }
        String s = Integer.toString(sum);
        int c=0;
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}
