
import java.util.*;

public class OOPS {
    public static void main(String args[]){

        // Constructors
        // Pen p1 = new Pen("black Pen");
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // System.out.println(p1.name);

        // Pen p2 = new Pen("red");
        // p2.roll = 123;
        // p2.password = "abcd";
        // p2.marks[0] = 100;
        // p2.marks[1] = 200;
        // p2.marks[2] = 300;

        // Pen p3 = new Pen(p2);
        // p2.marks[2] = 400;

        // for(int i=0; i<3; i++){
        //     System.out.println(p3.marks[i]);
        // }

        Rohi shark = new Rohi();
        shark.eat();
        shark.size();

        Calculator c1 = new Calculator();
        System.out.println(c1.sum(2,4));
        System.out.println(c1.sum((float)2.1,(float)3.2));
        System.out.println(c1.sum(2,4,7));


        Palm p1 = new Palm();
        p1.size();
    }
}

 

//  class Pen{
//     private String color;
//     private int tip;
//     String name;
//     int roll;
//     String password;
//     int marks[];
    
     //Shallow copy constructor
//     Pen(Pen p2){
//         marks = new int[3];
//         this.roll = p2.roll;
//         this.password = p2.password;
//         this.marks = p2.marks; 
//     }

    // Deep copy constructor
//     Pen(Pen p2){ 
//         marks = new int[3];
//         this.roll = p2.roll;
//         this.password = p2.password;
//         for(int i=0;i<marks.length;i++){
//             this.marks[i] = p2.marks[i];
//         }
//     }

//     Pen(String name){
//         marks = new int[3];
//         this.name=name;
//     }
    
//     String getColor(){
//         marks = new int[3];
//         return this.color;
//     }
//     void setColor(String newColor){
//         marks = new int[3];
//         color = newColor;
//     }
//     void setTip(int newTip){
//         marks = new int[3];
//         tip = newTip;
//     }
// }



//Base Class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}

//Second Derived Class
class Rohi extends Fish{
    int survivalDays;
    void size(){
        System.out.println("Medium");
    }
}



//Method overloading (compile time polymorphism )
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}


//Method Overridding (run time polymorphism)
class Tree{
    void size(){
        System.out.println("small to large");
    }
}

class Palm extends Tree{
    void size(){
        System.out.println("Large in size");
    }
}