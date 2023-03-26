package LEC_34;

import java.util.ArrayList;
import java.util.List;

public class LEXICOGRAPHICALLY_COUNTING {
    public static void main(String[] args) {
        int n=1000;

//        PrintCounting(0, n, list);
        PrintCounting(n);



    }
    public static List<Integer> PrintCounting(int n){
        ArrayList<Integer> list = new ArrayList<>();
        PrintCounting(0, n, list);
        System.out.println(list.toString());
        return list.subList(1, list.size());
    }
    public static void PrintCounting(int curr, int n, ArrayList<Integer> list) {
        if(curr>n){
            return;
        }
        list.add(curr);
//        System.out.println(curr);
        int i=0;
        if(curr == 0){
            i=1;
        }
        for(; i<=9;i++){
            PrintCounting(curr *10+i,n, list);
        }

    }
}
