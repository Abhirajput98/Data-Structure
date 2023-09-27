package LEETCODE;

import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);

            }
            System.out.println();

        }
        System.out.println("<<<<<<<<<<<<<<<<");

        // flip(image);
        //System.out.println(Arrays.toString(image));
        for (int i = 0; i < image.length; i++) {
            int k = image[0].length-1;
            for (int j = 0; j <(image[0].length/2); j++) {
                int temp = image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
                k++;
            }
           // System.out.println();

        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }


        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);

            }
            System.out.println();

        }



    }
//   public static void flip (int [][] image){
//        for(int i =0;i<image.length-1;i++){
//             int temp=image[i][image.length-1];
//            for(int j = image[0].length-2;j>0;j--){
//                image[i][j]=image[i][j+1];
//
//            }
//
//            image[i][0]=temp;
//
//        }
//        return;
//    }
}
