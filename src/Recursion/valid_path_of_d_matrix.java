package Recursion;

public class valid_path_of_d_matrix {
    public static void main(String[] args) {
        int er=3;
        int ec=3;
        printpath(er-1,ec-1,0,0,"");

    }
    public static void printpath(int er,int ec, int cr,int cc,String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if(cr>er){
            return;

        }
        if(cc>ec){
            return;
        }
        printpath(er,ec,cr+1,cc,ans+"V");
        printpath(er,ec,cr,cc+1,ans+"H");
    }
}
