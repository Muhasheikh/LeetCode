package leetCode.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public static void main(String[] args) {
        int[] nums = {2,1};
        int[] nums2 = {1,2};

        System.out.println(Arrays.toString(intersection(nums, nums2)));
    }

    static int[] intersection(int[]num1,int[]num2){


        List<Integer> list = new ArrayList<>();



        for (int i=0;i<num1.length;i++){

            for (int j=0;j<num2.length;j++){

                    if(num1[i]==num2[j]){
                        if(list.contains(num1[i])){
                            continue;
                        }
                        else {
                            list.add(num1[i]);
                        }

                    }
            }
        }
        int[] result = new int[list.size()];
        int i=0;

        while(list.size() > 0){
            result[i] = list.get(0);
            list.remove(0);

            i++;


        }




        return result;
    }
}
