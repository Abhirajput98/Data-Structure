package LEC_6;

public class Data_Type {
    public static void main(String[] args) {
        byte b= (byte)(428); // << -84
        int i =10;
        long j = 10;
        short l=10;
        // b=i; //<<  error i consits of 32 bit i.e it can'nt be stored in byte(8bit)
        b=(byte)(i);
        System.out.println(b);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);



    }

}
