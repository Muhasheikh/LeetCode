package externalQuestions;

public class ArmStrong {

    public static void main(String[] args) {

        System.out.println(isArmStrong(1533));
    }

    static boolean isArmStrong(int n){

        int ans =0;
        int original = n;
        while(n>0){

            int rem = n%10;
            ans = ans + rem*rem*rem;

            n/=10;
        }

        return ans == original;
    }
}
