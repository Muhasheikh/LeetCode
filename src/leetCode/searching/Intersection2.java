package leetCode.searching;

import oop.interfaces.nestedInterface.A;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection2 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    static int[] intersect(int[] nums1, int[] nums2){

        ArrayList<Integer> list = new ArrayList<>();

        for(int n=0;n<nums1.length;n++){

            for(int s=0;s<nums2.length;s++){

                if(list.contains(nums1[n])){

                    continue;
                }
                else if(nums1[n]==nums2[s]){

                    list.add(nums1[n]);
                }
            }
        }
        System.out.println(list);
        int[] result = new int[list.size()];
        int i=0;
//        while(list.size()>=0){
//
//            result[i++]= list.get(0);
//            list.remove(0);
//        }

        return result;
    }
}
