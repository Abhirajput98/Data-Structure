package LEC_9;
import   java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        int [] arr ={ 1,2,-1,4,6};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(arr,n));

    }
    public static int fun( int  [] ar1,int k){
        int i;
        for (i=0;i<= ar1.length;i++){
            if(ar1[i]==k){
                return i;
            }
        }
        return -1;
    }
}
