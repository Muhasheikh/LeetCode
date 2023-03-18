package externalQuestions;

import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(Arrays.toString(concatArray(nums)));
    }

    static int[] concatArray(int nums[]){

        int[] result = new int[2* nums.length];

        for(int i=0;i< nums.length;i++){

            result[i] = nums[i];
            result[i+ nums.length] = nums[i];
        }
    return result;
    }
}
