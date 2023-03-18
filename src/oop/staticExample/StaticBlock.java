package oop.staticExample;

public class StaticBlock {

    static int a=5;
    static int b;

    static{
        System.out.println("Iam in static block");
        b= a*5;
    }
    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b+=3;

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

       // System.out.println(a + " " + b);
    }
}
