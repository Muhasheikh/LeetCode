package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbers {

    public static void main(String[] args) {

        int[][] nums = {
                {4,8},
                {5,2},
                {7,1},
                {3,6}


        };


        System.out.println(luckyNumbers(nums));

        System.out.println(leetCode(nums));



    }

   static List<Integer> luckyNumbers (int[][] matrix) {


        List<Integer> ans = new ArrayList<>();

       int max=matrix[0][0];
       int index =0;
       for(int i=0;i< matrix.length;i++){

           if(matrix[i][0]>max)
           {
               max =matrix[i][0];
               index++;
           }

       }


       int min = Integer.MAX_VALUE;
       int colIndex=0;
       for(int i=0;i<1;i++){

           for (int j=0;j<matrix[i].length;j++){

               if(matrix[index][j]<min){

                   min = matrix[index][j];
                   colIndex = j;

               }
           }


           ans.add(0,matrix[index][colIndex]);
       }
    return ans;
   }

   static List<Integer> leetCode (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] mi = new int[m], mx = new int[n];
        Arrays.fill(mi, Integer.MAX_VALUE);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mi[i] == mx[j])  {
                    res.add(mi[i]);
                    break;           // credit to @Ausho_Roup
                }
            }
        }
        return res;
    }
}
