package leetCode.searching;

public class SpecialArray {
    public static void main(String[] args) {

        int [] nums = {0,4,3,0,4};

        System.out.println(specialArray(nums));
    }

    static int specialArray(int[]nums){



        for(int i=1;i< 1001;i++){
            int count =0;
            for (int num : nums) {

                if (num >= i) {

                    count++;
                }

            }
            if(i==count){

                return i;
            }


        }
        return -1;
    }
}
