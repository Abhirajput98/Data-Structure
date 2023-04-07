package LEC_48;

import java.util.Scanner;
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {

                Scanner S = new Scanner(System.in);
                int [] arr = {2,3,5,4,6,1,7};
                System.out.println(leetcode( arr));
            }

            public static int leetcode(int [] arr){
                int ans=0;
                Stack<Integer> st = new Stack<>();
                for(int i=0;i<arr.length;i++){
                    int area =0, h=0,r=0,l=0;
                    while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                        h = arr[st.pop()];
                        r =i;
                        if(st.isEmpty()){
                            area = h*r;
                            ans = Math.max(ans, area);
                        }
                        else{
                            l=st.peek();
                            area = h*(r-l-1);
                            ans = Math.max(ans,area);
                        }
                    }
                    st.push(i);
                }
                int area =0, h=0,l=0;
                int r = arr.length;
                while(!st.isEmpty()){
                    h = arr[st.pop()];
                    if(st.isEmpty()){
                        area = h*r;
                        ans = Math.max(ans, area);
                    }
                    else{
                        l=st.peek();
                        area = h*(r-l-1);
                        ans = Math.max(ans,area);
                    }
                }
                return ans;
            }
        }
        



