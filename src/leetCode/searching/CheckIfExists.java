package leetCode.searching;

import java.util.Arrays;

public class CheckIfExists {

    public static void main(String[] args) {
        int[] arr = {3,1,7,11};

        //System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist2(arr));
    }
    static boolean checkIfExist(int[] arr) {
        int[] res = new int[2];
        for(int i=0;i< arr.length;i++){

            for(int j=0;j< arr.length;j++){

                if(i!=j&& arr[i]==2*arr[j]){


                    res[0] = i;
                    res[1] = j;

                    System.out.println(Arrays.toString(res));
                    return true;
                }
            }

        }
        res[0]=-1;
        res[1]=-1;
        System.out.println(Arrays.toString(res));
        return false;

    }

    static boolean checkIfExist2(int[] arr){



        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int target = 2 * arr[i];
            int start = 0;
            int end = arr.length-1;
            while(start<=end){


                int mid = start + (end-start)/2;

                if(arr[mid] == target && mid!=i){
                    return true;
                }

                if(arr[mid]>target){

                    end = mid-1;
                }
                else {
                    start= mid+1;
                }
            }
        }

            return false;
    }
}
