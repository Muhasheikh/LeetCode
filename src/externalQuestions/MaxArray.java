package externalQuestions;

public class MaxArray {

    public static void main(String[] args) {
        int[] nums ={ 1,2,3,4,5,6};

        System.out.println(maxValue(nums));
        System.out.println(secondMax(nums));
        System.out.println(maxValueBinary(nums));
    }

    static int maxValue(int[] nums){
             int max= nums[0];
        for (int i=1;i<nums.length;i++){

            if(nums[i]>max){

                max=nums[i];
            }
        }

        return max;
    }

    static int secondMax(int[] nums){
        int max = nums[0];
        int temp =0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>max){
                temp=max;
                max=nums[i];
            }
        }
        return temp;
    }

    static int maxValueBinary(int[] num){

        int start = 0;
        int end = num.length-1;

        while (start<=end){

            int mid = start + (end-start)/2;

            if(num[start]<num[mid]){
                start = mid+1;
            }
            if(num[end]>num[mid]){
                return end;
            }



        }

        return -1;
    }
}
