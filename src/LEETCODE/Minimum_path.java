package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Minimum_path {
    public static void main(String[] args) {
      int [][] m = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
      int si=0;
      int l = m.length-1;
      int target=3;
      int i=0;
      while(si<=l){
          int mid= (m[i].length)/2;
         // System.out.println(mid);
          if(m[i][mid]==target){
              System.out.println("yes");
          }
          if(m[i][mid]>target){
              l=mid-1;
          }
          else {
              si=mid+1;
          }
          i++;

      }




    }
}
