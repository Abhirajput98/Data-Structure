package LEC_37;

public class queen_combination {
    public static void main(String[] args) {
        combination(0,2,"",4);

    }
    public  static  void combination(int col,int qtp,String Path ,int total_call){
        if(qtp==0){
            System.out.println(Path);
            return;
        }
        if(col==total_call){
            return;
        }
        combination(col+1,qtp-1,Path+"q"+col,total_call);
        combination(col+1,qtp,Path,total_call);


    }
}
