package LEC_20;

import java.util.ArrayList;

public class Arrays_For_Each_loop {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(29);
        list.add(23);
        for( int c: list){
            System.out.println(c);
        }
    }
}
