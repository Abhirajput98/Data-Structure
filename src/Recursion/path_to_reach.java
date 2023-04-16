package Recursion;

public class path_to_reach {
    public static void main(String[] args) {
        int n =4;
        path("",n,0);
    }
    public static void path(String ans ,int n,int a){
        if(a==n ){
            System.out.println(ans);
            return;
        }
        if(a>n){
            return;
        }
        path(ans+"1",n,a+1);
        path(ans+"2",n,a+2);
        path(ans+"3",n,a+3);
    }
}
