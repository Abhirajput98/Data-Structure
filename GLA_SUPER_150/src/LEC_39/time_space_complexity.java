package LEC_39;

public class time_space_complexity {
    public static void main(String[] args) {
        System.out.println(prime(12));

    }
    public static boolean prime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;

        }
        return true;
    }


}
