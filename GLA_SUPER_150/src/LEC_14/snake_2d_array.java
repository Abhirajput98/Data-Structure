package LEC_14;
import java.util.Scanner;

public class snake_2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col=sc.nextInt();
        int [][] arr= new int[row][col];
        for(int i =0;i< row;i++){
            for(int j =0;j<col;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        int j=0;
            for (int i =0;i<col;i++){
                if(i%2==0){

                for(j=0;j<row;j++){

                    System.out.print(arr[j][i]+" ");

                }

        }
                else{
                    for(j=row-1;j>=0;j--){
                        System.out.print(arr[j][i]+" ");
                    }
                }

            System.out.println();
        }
    }
}
