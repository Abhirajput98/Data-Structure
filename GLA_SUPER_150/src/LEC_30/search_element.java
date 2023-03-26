package LEC_30;

public class search_element {
    public static void main(String[] args) {
        int [] arr ={5,7,23,42,2,4};
        System.out.println(searcg(arr,0,2));
    }
    public static int searcg(int []  arr,int i,int target){
        if(arr[i]==target){
            return i;
        }
        return searcg(arr,i+1,target);

    }

}
