package Geeks_for_Geeks;

public class Maximum_Sum_Problem {
    //static int sum=0;
    public static void main(String[] args) {
        int n=12;
        System.out.println(max(n));
    }
    public static int max(int n){
        if(n<=0){
            return 0;
        }
        int sum=n;
        int a=max(n/2);
        int b=max(n/3);
        int c=max(n/4);
        sum=Math.max(sum,a+b+c);
        return sum;


    }
}
