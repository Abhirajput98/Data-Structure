package LEETCODE;

public class longest_pelindrome_substring {
    public static void main(String[] args) {
        String news= "";

        String s= "abccba";
        String str ="";
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1; j<=s.length();j++){
                if(is_pelindrome(s.substring(i,j))){
                   int l = s.substring(i,j).length();
                   if(str.length() < l)
                       str = s.substring(i, j);
                }
            }
        }
        System.out.println(str);

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
