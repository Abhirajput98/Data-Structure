package LEETCODE;

public class Count_Prefix_and_Suffix_Pairs_I {
    public static void main(String[] args) {
       String [] words = {"abab","ab"};
       // System.out.println(prefsfix("aba","ababa"));
        int count=0;
        for(int i =0;i<words.length-1;i++){
            for(int j =i+1;j< words.length;j++){
                if(prefsfix(words[i],words[j])){
                    count++;
                }
            }

        }
        System.out.println(count);

    }
    public static boolean prefsfix(String a , String b){
        if(a.length()>b.length()){
            return false;
        }
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        int k =b.length()-1;
        for(int j=a.length()-1;j>=0;j--){
            if(a.charAt(j)!=b.charAt(k)){
                return false;
            }
            k--;
        }
        return true;
    }
}
