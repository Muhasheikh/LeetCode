package externalQuestions;

public class Occurances {

    public static void main(String[] args) {
        System.out.println(occurances(1522222211,1));
    }

    static int occurances(int n, int target){

        int count=0;
            while(n>0){

                int rem = n%10;

                if(rem==target){
                    count++;
                }
                n/=10;
            }

            return count;
    }
}
