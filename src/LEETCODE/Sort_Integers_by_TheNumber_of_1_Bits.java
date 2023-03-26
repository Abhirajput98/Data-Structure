package LEETCODE;

import java.util.Arrays;

public class Sort_Integers_by_TheNumber_of_1_Bits {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = new int[arr.length];
//        System.out.println(number_of_ones1(8));
       // int j =0;
        for(int i =0;i<arr.length;i++){
            int n =number_of_ones1(arr[i]);
            for(int j =1;j<arr.length;j++){
                if(n<=number_of_ones1(arr[j])){
                    ans[i]=arr[i];

                }
            }

        }
        System.out.println(Arrays.toString(ans));
        }

    public static int number_of_ones1(int n ){
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem=n%2;
            sum=sum+rem*mul;
            n=n/2;
            mul=mul*10;

        }
        String s = Integer.toString(sum);
        sum=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sum+=1;
            }
        }
        return sum;

    }
    }
