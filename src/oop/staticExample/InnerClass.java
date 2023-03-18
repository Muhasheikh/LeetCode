package oop.staticExample;

public  class InnerClass {

   static class A{


















































         String name;

        public A(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        A ob = new A("Muha");
        A ob1 = new A( "Faizla");
        System.out.println(ob.name);
        System.out.println(ob1.name);
    }
}
