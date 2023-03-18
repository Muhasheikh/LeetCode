package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArray {

    public static void main(String[] args) {

        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(nums,1));

    }

    static  List<Integer> addToArrayForm(int[] num,int k) {

        long ans=0;
        List<Integer> results = new ArrayList<>();

        for (int i : num){

            ans =ans * 10 +i;


        }
        ans+=k;



        int i=0;
    ;
        while(ans>0){
            long rem =0;
           rem =  ans%10;
           ans/=10;

            results.add(results.size()-i, (int) rem);
            i++;
        }

        return results;

    }


}
