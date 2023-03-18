package leetCode;

import java.util.Arrays;

public class sumZero {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(leetCOdeAns(4)));
        System.out.println(Arrays.toString(sumZero(
                4)));



    }

  static   int[] sumZero(int n) {

      int[] ans = new int[n];
      ans[0] = -1;

      int sum=ans[0];
      while(sum!=0) {
          sum = 0;
          for (int i = 1; i < ans.length; i++) {
              ;
              ans[i - 1] = (int) (Math.random() * -10);
              ans[i] = (int) (Math.random() * 10);

          }

          for (int i = 0; i < ans.length; i++) {

              sum += ans[i];


          }
          if (sum == 0) {
              return ans;

          }

      }
      return ans;
    }

    static int[] leetCOdeAns(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }

}
