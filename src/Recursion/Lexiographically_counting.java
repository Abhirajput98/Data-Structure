package Recursion;

public class Lexiographically_counting {
    public static void main(String[] args) {
        int n =1000;
        int current=0;
        printcounting(current,n);
    }
    public static void printcounting(int curr,int end){
        if(curr>end){
            return;
        }
        System.out.println(curr);
        if(curr==0){
            for(int i =1;i<=9;i++){
                printcounting(curr*10 +i,end);
            }
        }
        else {
            for(int i =0;i<=9;i++){
                printcounting(curr*10 +i,end);
            }
        }
    }
}
