package Recursion;

public class Back_Tracking_Queen_permutation {
    public static void main(String[] args) {
        boolean [] board = new boolean[4];
        printbpath(board,2,0,"");

    }
    public static void printbpath(boolean [] board, int tq , int qtbp,String ans){
        if (qtbp>tq){
            System.out.println(ans);
            return ;
        }
        for (int i = 0 ;i<4;i++){
            if(board[i]==false){
                board[i]=true;
               // System.out.println("b"+i+"q"+qtbp);
                ans+="b"+i+"q"+qtbp;

                printbpath(board,tq,qtbp+=1,ans);
                board[i]=true;



            }
            
        }

    }
}
