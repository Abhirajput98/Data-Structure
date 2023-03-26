package LEETCODE;

public class climb_stairs {
    public static void main(String[] args) {
        int  n =3;
        for (int i = 1; i <=n-1; i++) {
            climb(n,i,0);

        }

    }
    public static void climb(int n ,int c,int ans){
        if(c==n){
            System.out.println(ans);
            return;
        }
        climb(n,c+1,ans+1);
    }
}
