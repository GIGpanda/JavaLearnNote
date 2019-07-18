//: initialzation/Flower.java
// Calling constructors with "this"
import java.util.*;
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }
    Flower(String ss){
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals){
        this(petals);  // 必须将构造器调用置于最起始处
    //    this(s);  // Can't call two  this可以调用一个构造器，但却不能调用两个
        this.s = s;  //参数 s 的名称和数据成员s名字相同,用 this.s 代表数据成员
        System.out.println("String & int args");
    }
    Flower(){
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }
    void printPetalcount(){ // 除构造器外，编译器禁止在其他方法中调用构造器
    //    this(11);  // Not inside non-constructor
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }
    public static void main(String[] args){
        Flower x = new Flower();
        x.printPetalcount();
    }
}

