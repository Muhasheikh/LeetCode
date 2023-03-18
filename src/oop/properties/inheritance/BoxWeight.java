package oop.properties.inheritance;

public class BoxWeight extends  Box{

    int weight;

    public BoxWeight() {

        this.weight = -1;

    }

    BoxWeight(int side,int weight){

        super(side);
        this.weight =weight;
    }

    BoxWeight(BoxWeight obj){
        super(obj);

    }

    BoxWeight(int side){
        super(side);

    }

    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);// in order to set l,w,h we need to access the parent class. so we call the parent class

        this.weight = weight;
    }
}
