package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Merge_similar_Items {
    public static void main(String[] args) {
       int[][] items1 = {{1,1},{4,5},{3,8}};
       int [][]items2 = {{3,1},{1,5}};
        List<List> lm = new ArrayList<>();
       for(int i =0;i<items1.length;i++){
           List<Integer> l = new ArrayList<>();
           for(int j =0;j<items2.length;j++){
               if(items1[i][0]==items2[j][0] ){
                   l.add(items2[j][0]);
                   l.add(items1[i][1]+items2[j][1]);

               }}
           if(l.isEmpty()){
               continue;
           }
           if(!lm.contains(l)){
               lm.add(l);
           }

       }

        System.out.println(lm);
    }
}
