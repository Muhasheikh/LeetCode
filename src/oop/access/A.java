package oop.access;

public class A {

     private int var ;
    private int[] arr;


     A(int var){

         this.var= var;
         this.arr = new int[var];
     }

     public int getVar(){
         return var;
     }

     public int setVar(int var){
         this.var = var;
         return var;
     }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


}
