package externalQuestions;

public class Fibonanci {

    public static void main(String[] args) {

       // fiboNum(8);
        System.out.println(fiboNannci(4));
    }

    static void fiboNum(int n){

        int a =0;
        int b=1;

        System.out.print(a + " " +  b + " ");

        for(int i=0;i<n;i++){

            int temp =b;
            b= a+b;
            a= temp;

            System.out.print(b + " ");
        }
    }

    static  int fiboNannci(int n){

        if(n<2){
            return n;
        }

        return fiboNannci(n-1) + fiboNannci(n-2);
    }
}
