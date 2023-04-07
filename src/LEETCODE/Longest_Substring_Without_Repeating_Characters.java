package LEETCODE;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "bbb";
        int ans=0;
        for(int i =0;i<s.length()-1;i++){
            for(int j =i+1;j<s.length();j++){
               if(ishasuniqe(s.substring(i,j+1))){
                 //  System.out.println(s.substring(i,j+1));
                   ans = Math.max(ans,s.substring(i,j+1).length());
               }

            }
        }
        System.out.println(allsame("aaad"));
        //System.out.println(ans);
      //  System.out.println(ishasuniqe("abs"));
    }
    public static boolean ishasuniqe(String s){
        for(int i=0;i<s.length()-1;i+=2){

              if(s.charAt(i)==s.charAt(i+1)){
                    return false;
                }
            }

        return true;
    }
    public static boolean allsame(String s){
        int c=0;
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
        }
        if(s.length()-1==c){
            return true;
        }
        return false;
    }
}
