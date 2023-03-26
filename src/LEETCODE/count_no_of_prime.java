package LEETCODE;

import java.util.Arrays;

public class count_no_of_prime {
    public static void main(String[] args) {
        int n = 10;
        int k =0;

       // System.out.println(Arrays.toString(sieveOfEratosthenes(10)));
        boolean [] arr =sieveOfEratosthenes(10);
        System.out.println(Arrays.toString(arr));
        for(int i =0;i <arr.length;i++){
             if(arr[i]){
                 k++;


            }
        }
        System.out.println(k);

    }
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i*i<=n; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

}
