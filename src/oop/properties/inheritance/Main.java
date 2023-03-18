package oop.properties.inheritance;

public class Main {

    public static void main(String[] args) {

//        BoxWeight box1 = new BoxWeight(2,3,4,5);
//        System.out.println(box1.h + " " + box1.l + " " + box1.w + " "+ box1.weight);
//        BoxWeight box = new BoxWeight();
//        System.out.println( box.weight);

        BoxWeight b1 = new BoxWeight();
        System.out.println(b1.weight +" " + b1.l);

        BoxWeight box = new BoxWeight(1,2,4,5);
        System.out.println(box.weight +" " + box.l);

//        Box box = new Box();
//        Box cube = new Box(4);
//        Box box1 = new Box(cube);
//        System.out.println(box.h + " " + box.l + " " + box.w);
//        System.out.println(cube.h + " " + cube.l + " " + cube.w);
//        System.out.println(box1.h + " " + box1.l + " " + box1.w);


        Parent p = new Child("Muha");

    }
}
