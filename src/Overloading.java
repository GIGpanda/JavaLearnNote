//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading
import java.util.*;

class Tree{   // 方法重载
    int height;
    Tree(){  // 无参构造器
        System.out.println("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight){
        height = initialHeight;
        System.out.println("Creating new Tree that is "+ height + " feet tall");
    }
    void info(){
        System.out.println("Tree is " + height + " feet tall");
    }
    void info(String s){
        System.out.println(s + "Tree is" + height + " feet tall");
    }
}
public class Overloading {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
