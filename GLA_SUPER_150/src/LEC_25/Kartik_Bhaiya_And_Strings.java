package LEC_25;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        String s = "aababbaababbaa";
        int k=3;
        int aFlip =perfectness_maximum(s,k,'a');
        int bflip=perfectness_maximum(s,k,'b');
        System.out.println(Math.max(aFlip,bflip));


    }
    public static int perfectness_maximum(String str,int k,char ch){
        int si=0;
        int ei=0;
        int flip=0;
        int ans=0;
        while (ei<str.length()){
            // window growing
            if(str.charAt(ei)==ch){
                flip++;
            }
            // window shrink krna hai;
            while(flip>k){
                if(str.charAt(si)==ch){
                    flip--;
                }
                si++;
                // cal window size;


            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return  ans;
    }
}
