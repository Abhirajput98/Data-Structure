package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;

public class Least_Number_of_Unique_Integers_after_K_Removals {
        public static void main(String[] args) {
               int [] arr = {5,5,4};
                HashMap <Integer,Integer> h = new HashMap<>();
                for(int i =0;i<arr.length;i++){
                        if(h.containsKey(arr[i])){
                                h.put(arr[i],h.get(arr[i])+1);
                        }
                        else{
                                h.put(arr[i],1);
                        }
                }
                int [] hashmapvalues= new int[h.size()];
                int i=0;
                for(int v :h.values()){
                        hashmapvalues[i]=v;
                        i++;
                }
                Arrays.sort(hashmapvalues);
                System.out.println(Arrays.toString(hashmapvalues));
                int k=1;
                int j=0;

                for(int l=0;l<hashmapvalues.length;l++){
                        k-=hashmapvalues[l];
                        //j++;

                        if(k<0){
                                j+=1;
                               // System.out.println(j+l);;
                                break;

                        }
                        else if(k==0){
                                j=l;
                               // System.out.println(l);
                                break;
                        }

                        //j++;

                }
                System.out.println(hashmapvalues.length-j-1);





                System.out.println(h);
        }
        }
