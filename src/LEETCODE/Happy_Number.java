package LEETCODE;

public class Happy_Number {
    public static void main(String[] args) {
        int n = 19;
        //  System.out.println(sum(19));

    }

    public static double sum(int n ){
        double sum=0;
        while(n!=0){
            double a = n%10;
            sum=sum+ Math.pow(a,2);
            n=n/10;
        }
        return sum;
    }
}
