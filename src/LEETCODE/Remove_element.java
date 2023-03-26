package LEETCODE;

public class Remove_element {
    public static void main(String[] args) {
        int val=2;
        int [] nums = {1,2,3,4,5,2};
        int c=0;
        int j=0;

        int [] arr= new int [nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                arr[j]=nums[i];
                j++;
            }

        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
