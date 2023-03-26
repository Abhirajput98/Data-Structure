package LEETCODE;

public class consicutive_one {
    public static void main(String[] args) {
       int [] nums = {1,1,1,1,1,0,1,1,1,1};
       int c=0;
       int ans=0;
       int j=0;



        for(int i =0;i< nums.length;i++){
            if(j< nums.length){
                if(nums[i]==1 && nums[j]==1){
                    ans++;
                    c=Math.max(c,ans);

                }

                else{
                    ans=0;
                }
                j++;
            }

            }


       System.out.println(c);

    }
}
