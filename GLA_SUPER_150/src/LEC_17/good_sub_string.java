package LEC_17;
import java.util.Scanner;

public class good_sub_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(goodstring(s));


    }
    public static int goodstring(String s){
        String a="";

        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1; j<=s.length();j++){
                if(a.length()<((s.substring(i,j).length()))){
                    a=a+s.substring(i,j);

                }
            }

            }
        return a.length();

    }

}
