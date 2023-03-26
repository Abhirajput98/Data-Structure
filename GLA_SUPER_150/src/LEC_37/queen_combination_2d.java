package LEC_37;

public class queen_combination_2d {
    public static void main(String[] args) {
        combination_2d(0,0,2,"",3,3);

    }
    public  static  void combination_2d(int r,int c,int qtp,String path,int tots_r,int tots_c){
        if(qtp==0){
            System.out.println(path);
            return;
        }
        if(c==tots_c){
            c=0;
            r++;
        }
        if(r==tots_r){
            return;
        }
        combination_2d(r,c+1,qtp-1,path+"Q{"+r+","+c+"}",tots_r,tots_c);
        combination_2d(r,c+1,qtp,path,tots_r,tots_c);
    }
}
