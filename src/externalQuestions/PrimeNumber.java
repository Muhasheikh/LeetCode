package externalQuestions;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(checkPrime(13));
    }

    static boolean isPrime(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    static boolean checkPrime(int n){

        int c =2;

        while (c*c<=n){

            if(n%c==0){
                return false;
            }
            c++;
        }

        return true;

    }
}
