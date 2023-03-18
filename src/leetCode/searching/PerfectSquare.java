package leetCode.searching;

public class PerfectSquare {

    public static void main(String[] args) {

        //System.out.println(isPerfectSquare(1));
        System.out.println(isSquare(2147483647));
    }

    static  boolean isPerfectSquare(int num) {

        int n =2 ;

        if(num==1){

            return true;
        }


        while(n<=num/2){

            if(n*n==num){
                System.out.println(n);
                return true;
            }


            n++;

        }

        return false;
    }

    static boolean isSquare(int n){

        if(n==1)
            return true;

        int start =1;
        int end = n;

        while(start<=end){

            int mid = start+ (end-start)/2;
            long sqre = mid*mid;
            if(mid*mid==n){
                System.out.println(mid);
                return true;
            }

            if(sqre>n){
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return false;
    }
}
