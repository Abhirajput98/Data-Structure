package LEETCODE;

public class Maximum_truck_size {
    public static void main(String[] args) {
       int [][] boxTypes ={{1,3},{2,2},{3,1}};
       int truckSize=4;
        int load=0;
        int ans=0;
        for(int i =0;i<boxTypes.length;i++){
            int [] arr = boxTypes[i];
            int a = arr[0];
            int b =arr[1];
            int j=1;
            int sum=0;
           // System.out.println(a+" "+b);
            while(a*j <=truckSize && j<=b){
                //System.out.println(a*j);
                sum++;
                j++;
            }
           // sum=sum*b;
            System.out.println(sum*a);
           // ans+=sum*b;

        }
        //System.out.println(ans);

    }
}
