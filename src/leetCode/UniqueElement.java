package leetCode;

public class UniqueElement {

    public static void main(String[] args) {

        int[] ans = {2,4,4,3,2,1,1};

        System.out.println(ans(ans));
    }

    private static int ans(int[] ans) {
        int unique=0;
        for(int n : ans){

            unique ^= n;
        }

        return unique;
    }
}
