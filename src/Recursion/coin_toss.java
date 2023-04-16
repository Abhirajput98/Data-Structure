package Recursion;

public class coin_toss {
    public static void main(String[] args) {
        tosscoin("",3);
    }
    public static void tosscoin(String ans,int n){
        if(n==0){
            System.out.println(ans);
            return;
        }
        tosscoin(ans+"H",n-1);
        tosscoin(ans+"T",n-1);
    }
}
