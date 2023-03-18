package leetCode;

import java.util.Arrays;

public class MatrixReshape {

    public static void main(String[] args) {

        int[][] nums = {

                {1,2},
                {3,4}
        };

        int[][]results =matrixReshape2(nums,1,4);

        for(int i=0;i< results.length;i++){

            System.out.println(Arrays.toString(results[i]));;
        }

    }

   static int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][]ans = new int[r][c];



            for(int i=0;i<r;){
                for(int j=0;j<mat[i].length;j++){


                        ans[i][j] = mat[i][j];
                }
                i++;
                int s =1;
                for(int j= mat[i].length-s;j>=0;j--){

                    ans[r-i][c-s] =  mat[i][j];
                    s++;
                }

            }




        return ans;
    }

    static int[][] matrixReshape2(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c){
            return mat;
        }

        int rshape[][] = new int [r][c];

        for (int i = 0;
             i < c*r; i++) {


            int row1 = i / mat[0].length;
            int col1 = i % mat[0].length;
            int row2 = i / c;
            int col2 = i % c;

            rshape[row2][col2] = mat[row1][col1];

        }

        return rshape;
    }
}
