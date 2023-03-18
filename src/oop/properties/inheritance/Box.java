package oop.properties.inheritance;

public class Box {

      int l;
    int w;
    int h;

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(){

        this.h=-1;
        this.l=-1;
        this.w =-1;
    }

    Box(int Side){

        this.h=Side;
        this.l=Side;
        this.w=Side;
    }

    Box(Box obj){
        this.h= obj.h;
        this.l= obj.l;
        this.w= obj.w;
    }


}
