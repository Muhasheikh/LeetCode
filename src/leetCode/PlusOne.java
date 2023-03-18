package leetCode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

            int [] nums = {9};

        System.out.println(Arrays.toString(plusOne(nums)));
    }

   static int[] plusOne(int[] digits) {
        int sum=0;

       for (int digit : digits) {

           sum = sum * 10 + digit; //123
       }

        sum+=1;
        int l = Integer.toString(sum).length();
        int[] results = new int[l];

        while(sum>0){

            int rem = sum%10;
            results[l-1] = rem;
            l--;
            sum/=10;
        }

        return  results;
    }
}
