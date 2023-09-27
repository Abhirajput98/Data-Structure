package LEC_50.LEC_29;

public class QES {
    public static void main(String[] args) {
        int n =5;
        rec(n);

    }

    public static void  rec(int n) {
        if(n==0){
            return ;
        }
        System.out.println(n);  // self work;
        rec(n-1); //sp


    }
}
