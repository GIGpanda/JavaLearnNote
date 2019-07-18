//: initialization/SimpleConstructor
// Demonstration of a simple constructor
import java.util.*;

class Rock{
    Rock(){  // 无参构造器
        System.out.println("Rock");
    }
}

public class SimpleConstructor {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++)
            new Rock();  // 现在创建对象时 会为对象分配存储空间 并调用相应的构造器
    }
}
