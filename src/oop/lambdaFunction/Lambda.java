package oop.lambdaFunction;

import java.util.function.Consumer;

interface Operation{

    int operation(int a, int b);
}
public class Lambda {

    public static void main(String[] args) {



        Operation sum = (a,b)-> {return a+b;};
        Operation multiply = (a,b)-> {return a*b;};


        System.out.println(sum.operation(10,5));
        System.out.println(multiply.operation(5,5));
    }
}
