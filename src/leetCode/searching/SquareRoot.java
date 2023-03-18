package leetCode.searching;

public class SquareRoot {

    public static void main(String[] args) {

        System.out.println(mySqrtBinarySearch(8));
        System.out.println(sqrtSearch(0));
    }

    static  int mySqrt(int x) {
        int sqRt = 0;
        if(x==0){
            return 0;
        }
        for(int i=1;i<=x/2+1;i++){

            sqRt = i*i;
            if(sqRt==x )
                 return i;
            if(sqRt>x)
                return i-1;
        }
        return 1;
    }

    static   int mySqrtBinarySearch(int x){

        int start =1;
        int end = x;
        int sqRt = 0;

        if(x==0){
            return sqRt;
        }

        while(start<=end){ //x=8 start =1 end =8

            int mid = start+(end-start)/2; //mid =4
            if(x/mid==mid){
                return mid;
            }
            if(x/mid<mid){
                end = mid-1;
            }
            else{
                start = mid+1;
                sqRt =mid;
            }

        }
            return sqRt;
    }

    static int sqrtSearch(int x){

        int start =1;
        int end = x;
        int sqrt=0;

        if(x==0){
            return 0;
        }

        while(start<=end){

            int mid = start + (end-start)/2;



            if(x/mid<mid){

                end = mid-1;
            }
            else {
                start = mid+1;
                sqrt = mid;

            }
        }

        return sqrt;
    }
}


