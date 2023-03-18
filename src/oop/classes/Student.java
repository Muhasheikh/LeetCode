package oop.classes;

public class Student {

    int rNo;
    String name;
    boolean isPresent;






    Student() {
       this(13,"Muha",false);
    }

    Student(int Roll,String name,boolean isPresent){

        this.rNo = Roll;
        this.name = name;
        this.isPresent = isPresent;

    }

    Student(Student obj){

        this.name = obj.name;
        this.rNo = obj.rNo;
    }

    public static void main(String[] args) {


        //Student s1 = new Student(1,"Muha",true);

     final Student s2 = new Student(1,"Muha",true);
     s2.name="Muhassan Kalashnkipv";



    }




}
