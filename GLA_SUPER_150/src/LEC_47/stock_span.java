package LEC_47;

import java.util.Stack;

public class stock_span {
    public static void main(String[] args) {
        int [] arr ={3,6,1,4,18,7,5,11};
        calspan(arr);

    }
    public static void calspan(int [] arr){
        int [] ans= new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else {
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
