import java.util.Scanner;
public class Array2dUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n,m,a;
        int [][]array ;
        System.out.println("enter the size of rows");
        n=sc.nextInt();
        System.out.println("enter the size of coloms");
        m=sc.nextInt();
        array=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.printf("enter the element of %d row",i);
                a=sc.nextInt();
                array[i][j]=a;
            }
        }
        System.out.println("YOUR 2 D ARRAY IS :- ");
        for(i=0;i<n;i++) {
            for (j = 0; j < m; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();

        }
    }
}
