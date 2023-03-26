package LEC_33;
import java.util.Scanner;


public class matrix_all_possible_path {
    public static void main(String[] args) {
        // DISPLAY ALL THE POSSIBLE WAY TO REACH THE END OF THE GIVEN N*M MATRIX<<< EIGTHERWE CAN GO HORIZONTLY OR VERTICALLY;
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        path(m,n,0,0,"");
       // System.out.println(count);



    }
    public  static void path(int row,int col,int i,int j,String p ){
        int count=0;

        if(row-1==i && col-1==j){
            System.out.println(p);
            count++;
            return;

        }
        if(i<row){  // verticle call
            path(row,col,i+1,j,p+"V");

        }
        if(j<col){   // horizontle cclll
            path(row,col,i,j+1,p+"H");
        }
        if(i==j && i<row && j<col){
            path(row,col,i+1,j+1,p+"D");
        }


    }
}
