package LEETCODE;

public class longest_pelindrome_substring {
    public static void main(String[] args) {
        String s = "babaaddaa";
      //  System.out.println(is_pelindrome("bad"));
        int ans=0;
        String news= "";
        int si =0;
        int li=0;
        for(int i =0;i<s.length();i++){
            for(int j =i+1;j<=s.length();j++){
                String sub = s.substring(i,j);

                    if(is_pelindrome(sub) && sub.length()>=ans) {
                       // System.out.println(sub);
                      //  System.out.println(sub.length());
                        ans = Math.max(ans,sub.length());
                       // System.out.println(ans);
                        si = i;
                        li = j;
                    }
                 //  ans = Math.max(ans,sub.length());


                }

        }
        System.out.println(s.substring(si,li));


    }

    public  static boolean is_pelindrome(String str){
        int j =str.length()-1;
        for(int  i =0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

}
