package LEC_78;

public class No_of_ones {
    public static void main(String[] args) {
        int n=67;
        int c=0;
        while(n>0){
            if((n&1)!=0){
                c++;

            }
            n= n >> 1;
        }
        System.out.println(c);
        System.out.println(optimize_(n));
    }
    public static int optimize_(int n){
        int count=0;
        while(n>0){
            n=(n)&(n-1);
            count++;
        }
        return count;
    }
}
