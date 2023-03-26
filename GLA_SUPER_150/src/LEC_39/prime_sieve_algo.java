package LEC_39;

public class prime_sieve_algo {
    public static void main(String[] args) {
        primesieve(100);

    }
    // >>> false -->prime
    // >> true -- > not prime

    public static void primesieve(int n )
    {
        boolean [] prime= new  boolean[n+1];
        prime[0]=prime[1]=true;
        for (int i = 2; i*i < prime.length; i++) {
            if(prime[i]==false){
               for(int  k=2;k*i< prime.length;k++){
                   prime[i*k]=true;
               }

            }

        }
        for (int i = 0; i < prime.length; i++) {
            if(prime[i]==false){
                System.out.print(i+" ");
            }

        }

    }
}
