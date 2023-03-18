package leetCode;

public class findRotation {

    public static void main(String[] args) {

        int[][] mat = {
                {0,1},
                {1,1}


        };




        int[][] target = {
                {1,0},
                {0,1}
        };

     System.out.println(findRotation(mat,target));

    }

  static  boolean findRotation(int[][] mat, int[][] target) {

      swap(mat);
      for(int i=0;i< target.length;i++){

          for(int j=0;j<target[i].length;j++){

                if(mat[i][j]!=target[i][j]){

                    return false;
                }


          }


      }


        return true;
    }


    static void swap(int[][] mat){

        for(int i=0;i< mat.length;i++){

            for(int j=0;j<mat[i].length;j++){

                int temp = mat[i][j+1-j];
                mat[i][j+1-j] = mat[i][j];
                mat[i][j]=temp;

                System.out.print(mat[i][j]+" ");
            }
            System.out.println();

        }
    }
}
