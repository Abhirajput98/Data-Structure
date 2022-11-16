package LEC_6;
public class Binary_to_6 {
    public static void main(String[] args) {
        int n =33;
        int sum=0;
        int mul=1;

        while(n!=0){
            int rem=n%2; // destination base 6
            sum=sum+rem*mul;
            n=n/2; // destination base se devide

            mul=mul*8; // source base se multiply

        }
        System.out.println(sum);

    }
}
