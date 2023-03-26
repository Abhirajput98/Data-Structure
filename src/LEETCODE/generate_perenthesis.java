package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class generate_perenthesis {
    public static void main(String[] args) {
        List<String> L = new ArrayList<>();
        System.out.println(generate(3,0,0,"",L));

    }
    public  static List<String> generate(int n , int opn, int close,String ans,List<String>lis){
        if(opn==n && close==n){
           // System.out.println(ans+" ");
            lis.add(ans);
            return lis;
        }
        if(opn<n){
            generate(n,opn+1,close,ans+"(",lis);
        }
        if (close<opn){
            generate(n,opn,close+1,ans+")",lis);
        }
        return lis;


    }
}
