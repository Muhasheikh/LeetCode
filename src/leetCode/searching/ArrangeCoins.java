package leetCode.searching;

public class ArrangeCoins {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));

        System.out.println(evenOdd(10));


    }

    static boolean evenOdd(int n){

        return (n & 1) == 1;
    }

    static  int arrangeCoins(int n){

        int count =1;

        while(n>0){

            n = n-count;

            if(n<0){
                break;
            }
            else {
                count++;
            }

        }

        return count-1;

    }
}
