package oop.properties.inheritance;

public class BoxPrice extends BoxWeight{

    int price;

    public BoxPrice(int price) {
        this.price = price;
    }

    public BoxPrice(int l, int w, int h, int weight, int price) {
        super(l, w, h, weight);
        this.price = price;
    }

    BoxPrice(int side,int weight,int cost){
        super(side,weight);
        this.price=cost;

    }
}
