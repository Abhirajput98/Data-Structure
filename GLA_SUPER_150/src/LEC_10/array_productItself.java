package LEC_10;

public class array_productItself {
    public static void main(String[] args) {
        // leet code array prodeuct of itself
        int  [] arr = { 2,3,4,2,5,5,6};


    }
    public static int [] arrayproduct(int [] arr){
        int [] left = new int[arr.length];
        left[0]=1;
        for(int i =1;i<arr.length;i++){
            left[i]=arr[i-1]*left[i-1];

        }
        int [] right = new int[arr.length];
        right[arr.length-1]=1;
        for( int i = arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];

        }
        for(int i =1;i<arr.length;i++){
            left[i]=left[i]*right[i];

        }
        return left;


    }
}
