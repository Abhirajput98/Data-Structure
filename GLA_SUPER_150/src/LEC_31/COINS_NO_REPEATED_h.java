package LEC_31;

public class COINS_NO_REPEATED_h {
    public static void main(String[] args) {
        int n = 4;
        //char a=' ';
        printcoins(n," ");

    }
    public  static void printcoins(int n,String ans){
        int l=ans.length()-1;
        if(n==0   ) {
            System.out.print(ans + " ");
            return;
        }
        if('H'!=ans.charAt(l)){
            printcoins(n-1,ans+"H");

        }


        printcoins(n-1,ans+"T");
        }
    }
