package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class kth_smallest_element {
    public static void main(String[] args) {
        int [][]matrix = {{-5}};
        List <Integer> l = new ArrayList<>();
        for(int i =0;i< matrix.length;i++){
            for (int j =0;j<matrix[0].length;j++){
                int k = matrix[i][j];
                l.add(k);
            }
        }
        int c=l.get(0);
        int d=0;
        System.out.println(l);
        if(l.size()==1){
            System.out.println(l.get(0));
        }
        for (int i =0;i< l.size()-1;i++){
            if(c<l.get(i+1)){
                d++;


            }
            if(d==1){
                System.out.println(l.get(i));
            }

        }

    }
}
