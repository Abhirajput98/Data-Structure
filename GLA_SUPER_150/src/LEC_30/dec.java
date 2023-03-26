package LEC_30;

public class dec {
    public static void main(String[] args) {
        int n=5;
        inc(n);

    }
    public static void inc(int n ){
        if(n<1){
            return;
        }
        inc(n-1);

        System.out.println(n);


    }
}
