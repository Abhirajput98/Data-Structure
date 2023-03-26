package LEETCODE;

public class majority_element {
    public static void main(String[] args) {
        int []nums = {2,2,1,1,1,2,2};
        int n = nums.length/2;
       // System.out.println(n);
        int k=1;
        //int c=0;
        for(int i =0;i <nums.length;i++){
            int c=0;
           for(int j=i;j<nums.length;j++){
               if(nums[i]==nums[j]){
                   c++;

               }


           }
           if(c>n){
               System.out.println(nums[i]);

           }


            }
    }
}
