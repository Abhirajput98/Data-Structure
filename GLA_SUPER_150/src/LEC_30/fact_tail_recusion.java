package LEC_30;

public class fact_tail_recusion {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n,1));
    }
    public static int fact(int n ,int res){
        if(n==0){
            return res;
        }
        return fact(n-1,res*n);
    }
}
