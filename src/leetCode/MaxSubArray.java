package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

    public static void main(String[] args) {

       //int[] nums = {5,4,-1,7,8};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};



        int sum=0;
        int max = 0;
        int temp=0;
        for (int i=0;i< nums.length;i++){

            sum =0;



            for(int j=i;j< nums.length;j++){

                sum+=nums[j];

            }

            temp =sum;

             max = Math.max(max,temp);



        }


        System.out.println(max);


    }
}
