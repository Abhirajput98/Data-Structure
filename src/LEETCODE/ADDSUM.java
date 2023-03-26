package LEETCODE;

import javax.management.MBeanAttributeInfo;

public class ADDSUM {
    public static void main(String[] args) {
        String a = "11";
        String b ="1";
        String ans1=Integer.toString(binanry(Integer.parseInt(a)));
        String ans2=Integer.toString(binanry(Integer.parseInt(b)));
       // System.out.println(ans1);
      //  System.out.println(ans2);
        String qwe ="";
        for(int i =(Math.min(ans1.length(),ans2.length()))-1;i>=0;i--){
            if(ans1.charAt(i)=='1' && ans2.charAt(i)==1){
                qwe+="0";

            }
            else if((ans1.charAt(i)=='0' && ans2.charAt(i)==1)|| (ans1.charAt(i)=='1' && ans2.charAt(i)=='0')) {
                qwe+="1";
            }
        }
        System.out.println(qwe);
    }
    public  static  int binanry(int n){
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem=n%2; // destination base 6
            sum=sum+rem*mul;
            n=n/2; // destination base se devide

            mul=mul*10; // source base se multiply

        }
       return sum;
    }
}
