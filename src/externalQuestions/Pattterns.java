package externalQuestions;

public class Pattterns {

    public static void main(String[] args) {

        pattern12(5);
    }

     static void pattern(int n) {

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }


    static void pattern5(int n){

        for(int i=0;i<2*n;i++){

            int totalCol = i>n ? 2*n-i : i;

            for(int j=0;j<totalCol;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){

        for(int i=0;i<n;i++){

            int s = n-i;

            for(int space=0; space<s;space++){
                System.out.print(" ");
            }

            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){

        for (int row=0;row<n;row++){

            int space = row-1+1;

            for (int s = 0;s<space;s++){
                System.out.print(" ");
            }

            for (int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){

        for (int row =0;row<n;row++){
            int space = n-row;

            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for (int col=0;col<=row;col++){

                System.out.print(" *");
            }
            System.out.println();
        }
    }


    static void pattern9(int n){

        for (int row=0;row<n;row++){
            int space = row-1+1;

            for(int s=0;s<space;s++){
                System.out.print(" ");
            }

            for (int col=0;col<n-row;col++){

                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int row=1;row<=2*n;row++){
            int space = row>n ? 2*n-row : row-1;
            int totalCol = row>n ? row-n : n-row+1;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }

            for (int col=1;col<=totalCol;col++){

                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
