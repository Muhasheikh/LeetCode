package leetCode.searching;

public class Power {

    public static void main(String[] args) {
        System.out.println(findPower(9));
    }

    static int findPower(int n){


        int start = 2;
        int end = n/2;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(mid*mid*mid == n){
                return mid;
            }

            if(mid*mid*mid<n){
                start= mid+1;
            }

           else if(mid*mid*mid>n){

                end =mid-1;
            }

        }

        return -1;
    }
}
