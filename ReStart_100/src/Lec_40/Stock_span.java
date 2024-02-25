package Lec_40;

import java.util.Stack;

public class Stock_span {
    public static void main(String[] args) {
        int [] arr = { 91,11,13,15,38,42,37};
        span_cal(arr);
        String d2="regerg";
        String d ="gfdgf";
        System.out.println(d.equals(d2));
    }
    public static  void  span_cal(int [] arr){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int [arr.length];
        for(int i =0;i<arr.length;i++){
            int c=1;
            while (!s.isEmpty() && arr[i]>arr[s.peek() ]){
               // c++;
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-s.peek();  // jis index per khade hai aur jo stack ke top per hai .. unke beech ka deference hi consiwuitive less element hnhe

            }
            //ans[i]=c;
            s.push(i);
        }
        for(int i =0;i< ans.length;i++){
            System.out.println(arr[i]+" "+ans[i]);
        }


    }
}
