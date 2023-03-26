package LEC_32;

public class dice {
    public static void main(String[] args) {
        int n =4;
        dicecount(0,n,"");

    }
    public static void dicecount(int srce,int des,String ans){
        if(srce==des){
            System.out.println(ans+" ");
            return;
        }
        if(srce>des){
            return;
        }
        /*dicecount(srce+1,des,ans+1);
        dicecount(srce+2,des,ans+2);
        dicecount(srce+3,des,ans+3);*/
        for(int dice=1;dice<=3;dice++){
            dicecount(srce+dice,des,ans+dice);
        }

    }
}
