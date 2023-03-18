package oop.interfaces.nestedInterface;

public class A {

    public interface nestedIterface{

        boolean isOdd(int num);
    }
}

class b implements A.nestedIterface{

    public boolean isOdd(int num){

        return (num&1)==1;
    }

    public static void main(String[] args) {

        b obj = new b();
        System.out.println(obj.isOdd(5));
    }
}


