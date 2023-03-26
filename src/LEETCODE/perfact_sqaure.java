package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class perfact_sqaure {
    public static void main(String[] args) {
        int num = 1;
        List<Integer> l = new ArrayList<>();
        for(int i =1;i<=num;i++){

            if(i*i==num){
                l.add(i);
            }


        }
        System.out.println(l);
    }
}
