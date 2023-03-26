package LEC_32;
import java.util.ArrayList;
import java.util.List;

public class genrt_perenthesis {
    public static void main(String[] args) {
        int n =2;
        List <String> l = new ArrayList<>();
        gen(n,0,0,"",l);


    }
    public static  void gen(int n , int opn,int close,String ans,List<String> l){
        if(opn==n&&close==n){
            System.out.println(ans);
            return;
        }
        if(opn<n){
            gen(n,opn+1,close,ans+"(",l);

        }
        if(close<opn){
            gen(n,opn,close+1,ans+")",l);
        }



    }

}
