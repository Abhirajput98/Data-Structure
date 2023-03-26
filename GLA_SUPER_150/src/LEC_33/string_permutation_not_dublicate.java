package LEC_33;
import java.util.ArrayList;


public class string_permutation_not_dublicate {
    public static void main(String[] args) {
        String s ="abca";
        ArrayList<String> list=new ArrayList<>();
        permutation(s,"",list);


    }
    public static  void permutation(String s,String ans,ArrayList<String> list){
        if(s.length()==0) {
            if (!list.contains(ans)) {
                list.add(ans);
                System.out.println(ans);


            }
            return;

        }
        for(int i=0;i<s.length();i++){
            String s1=s.substring(0,i);
            String s2 = s.substring(i+1);
            char c = s.charAt(i);
            permutation(s1+s2,ans+c,list);

        }

        }

}
