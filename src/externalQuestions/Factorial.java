package externalQuestions;

public class Factorial {

    public static void main(String[] args) {

        factorialNum(20);
    }

    static void factorialNum(int n){



        for (int i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }




    }
}
