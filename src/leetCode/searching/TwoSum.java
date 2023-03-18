package leetCode.searching;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums= {2,3,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    static int[] twoSum(int[] nums, int target){

        int[] results = new int[2];

        results[0]=-1;
        results[1]=-1;

        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int sum = nums[start]+nums[end];
            if(sum==target){
                results[0]= start+1;
                results[1] = end+1;

                 return results;
            }
            else if(sum>target){
                end--;
            }
            else {
                start++;
            }



        }

        return results;
    }
}
