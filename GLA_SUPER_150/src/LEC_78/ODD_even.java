package LEC_78;

public class ODD_even {
    public static void main(String[] args) {
        int n =67;
        // last lsb dekhne ke liye n ka and && 1 ke sath leleo if 0 aata hai to even number ayega
         if((n&1)==0){
             System.out.println("Even");

         }
         else{
             System.out.println("odd");
         }

    }
}
