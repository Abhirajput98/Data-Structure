public class hacker_rank_loop {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int n =5;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(a+((int)Math.pow(2,i))*b);
            System.out.print(sum+" ");


        }
    }
}
