package externalQuestions;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] nums = {2,3,5,7,8};

        //System.out.println(Arrays.toString(reversalArray(nums)));
        reversal(nums);
    }

    static int[] reversalArray(int[] nums){

        for(int i=0;i<nums.length;i++){

            for (int j=i+1;j< nums.length;j++){

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    static void swap(int[]num,int a ,int b){

        int temp = num[b];
        num[b] = num[a];
        num[a] = temp;
    }

    static void reversal(int[] num) {

        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            swap(num, start, end); //{2,3,5,7,8};
            start++;
            end--;
        }

        System.out.println(Arrays.toString(num));
    }

}
