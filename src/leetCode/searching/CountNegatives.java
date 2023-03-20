package leetCode.searching;

public class CountNegatives {

    public static void main(String[] args) {

        int[][] grid = {

                {41,0},
                {3,2},

        };

        System.out.println(countNegeative(grid));
        System.out.println(countNegeativeBinarySearch(grid));
    }

    static int countNegeative(int[][] grid){

        int count = 0;

        for(int i=0;i<grid.length;i++){

            for(int j=0;j<grid[i].length;j++){

                if(grid[i][j]<0){

                    count++;
                }
            }
        }

        return count;
    }

    static int countNegeativeBinarySearch(int[][] grid){

        int count =0;

        int row = 0;

        while(row< grid.length){
            int start =0;
            int end = grid[row].length-1;

            while(start<=end){

                int mid = start + (end-start)/2;

                if(grid[row][mid]>=0){

                    start = mid+1;
                }
                else if(grid[row][mid]<0){

                    end = mid-1;
                }
            }
            count += (grid[0].length-1)-end;
            row++;
        }

        return count;


    }
}
