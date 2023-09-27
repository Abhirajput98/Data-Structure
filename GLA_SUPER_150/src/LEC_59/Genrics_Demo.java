package LEC_59;

public class Genrics_Demo {
    public static void main(String[] args){
        Integer [] arr = {10,2,443,453};
        Display(arr);
        String [] arr1 ={"RAm","Sunil","Rohit","Ankita"};
        Display(arr1);

    }
    public static <T>void Display(T [] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
