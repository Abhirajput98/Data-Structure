package LEETCODE;

import java.util.Arrays;

public class plus_one {
    public static void main(String[] args) {
        int [] d = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        String  a ="";
        for(int i  =0;i<d.length;i++){
            String l= Integer.toString(d[i]);
            a+=l;
        }
       // System.out.println(a);
        double n =  Double.parseDouble(a);
        n=n+1;
        //System.out.println(n);
        String s = Double.toString(n);
        int [] arr = new int[s.length()];
        //System.out.println(Arrays.toString(arr));
        for(int i =0;i<s.length();i++){
            int k = Integer.parseInt(s.substring(i,i+1));
            //System.out.println(k);
            arr[i]=k;

        }
        System.out.println(Arrays.toString(arr));

    }
}
