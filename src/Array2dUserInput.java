import java.util.Scanner;
public class Array2dUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n,m,a;
        int [][]array ;
        //System.out.println("enter the size of rows");
        n=sc.nextInt();
       // System.out.println("enter the size of coloms");
        m=sc.nextInt();
        array=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
               // System.out.printf("enter the element of %d row",i);
                a=sc.nextInt();
                array[i][j]=a;
            }
        }
        int r = sc.nextInt();
        int c= sc.nextInt();


        for(int k =0;k<r;k++){
            for(int l=0;l<c;l++){
                System.out.print(array[k][l]);
            }
        }



        }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int totalElements = nums.length * nums[0].length;
        if (totalElements != r * c || totalElements % r != 0) {
            return nums;
        }
        final int[][] result = new int[r][c];
        int newR = 0;
        int newC = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[newR][newC] = nums[i][j];
                newC++;
                if (newC == c) {
                    newC = 0;
                    newR++;
                }
            }
        }
        return result;
    }



}
