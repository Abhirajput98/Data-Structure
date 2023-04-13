package LEETCODE;

public class power_of_three {
    public static void main(String[] args) {
        int  n =16;
        //int  i =0;
        double n1 = n;
        double i=0;

        double ans=0;

        while(true){
            ans = Math.pow(3,i);
            if(ans==n1){
                System.out.println("yes");
            }
            if(ans<n1){
                i++;
            }
            else{
                break;
            }

        }
       // return false;
    }
}
