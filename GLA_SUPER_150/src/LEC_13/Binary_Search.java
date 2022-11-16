package LEC_13;

public class Binary_Search {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        int n =7;
        int si=0;
        int l = num.length-1;

        while(si<=l){
            int mid = (si + l)/2;
            if(num[mid]==n){
                System.out.println(mid);

            }
            else if(num[mid]>n){
                l=mid-1;

            }
            else {
                si=mid+1;

            }
        }

    }
}
