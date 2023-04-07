package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class prime_factors_ugly_number {
    public static void main(String[] args) {
        int n = 8;
        List<Integer> L =  isprime(n);
        int c=0;
        for(int i =0;i<L.size();i++){
            if(L.get(i)==2 || L.get(i)==3 || L.get(i)==5){
                c++;
            }
        }
        System.out.println(L);
    }
    public static List<Integer> isprime(int n ){
        List<Integer> l = new ArrayList<>();
        for(int i =2;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i*j==n){
                    l.add(i);
                    l.add(j);

                }
            }
        }
        return l;


    }
}
