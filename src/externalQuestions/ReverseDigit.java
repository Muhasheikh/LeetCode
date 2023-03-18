package externalQuestions;

public class ReverseDigit {

    public static void main(String[] args) {
            reverseDigit(153);
    }

    static void reverseDigit(int n){
        int ans =0;
        while(n>0){

            int rem = n%10;
             ans = ans * 10 + rem; //153
            n/=10;
        }

        System.out.println(ans);
    }
}
