package LEC_13;
import java.util.Scanner;

public class first_Bad_Version {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        int [] arr ={1,2,3,4,5,6,7,8,9};
        int l = arr.length-1;
        int n = sc.nextInt();
        int lo=1;
        int hi=l;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>n){
                hi=mid-1;
            }
            else if(arr[mid]<n){
                lo=mid+1;
            } else if (arr[mid]==n) {
                System.out.println(mid);
                break;

            }
        }


    }

}
