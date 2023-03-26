package LEETCODE;

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        int n =26;
        int m=0;
        String ans = "";
        for(int i =0;i<=n;i++){
            char k = (char)((65)+((i)%26));
            ans = k+ ans;

            System.out.println(k+" -> "+i+1);
            m++;


        }
    }
}
