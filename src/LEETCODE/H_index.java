package LEETCODE;

public class H_index {
    public static void main(String[] args) {
       int[] citations = {3,0,6,1,5};
       int k = citations[0];
       int l =0;
       for(int i =1;i<citations.length;i++){
           if(citations[i]<k){
               l=i;
           }
       }
        System.out.println(citations[l]);
    }
}
