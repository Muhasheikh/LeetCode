package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumArray {

    public static void main(String[] args) {

        int[] nums = {3,2,3};

        System.out.println((Arrays.toString(twoSum(nums,6))));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j< nums.length;j++){
                int total = 0;
                total = nums[i] + nums[j];
                if(total== target){

                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }

        }

        return ans;

    }
}
