package externalQuestions;

public class EvenOrOdd {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,67,8};
        evenOrOdd(nums);
    }

    static void evenOrOdd(int[] n){


        for(int i=0;i< n.length;i++){
            if(n[i]%2==0){
                System.out.println(n[i]+ " Even Number");

            }
            else {
                System.out.println(n[i] + " Odd Number");
            }
        }


    }
}
