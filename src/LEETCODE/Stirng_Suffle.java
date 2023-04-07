package LEETCODE;

public class Stirng_Suffle {
    public static void main(String[] args) {
      String  s = "codeleet";
      int []indices = {4,5,6,7,0,2,1,3};
      String ans = "";
      for(int i =0;i<indices.length;i++){
          for(int j=0;j<indices.length;j++){
              if(indices[j]==i){
                 ans+=s.charAt(j);

              }
          }
      }
       System.out.println(ans);

    }
}
