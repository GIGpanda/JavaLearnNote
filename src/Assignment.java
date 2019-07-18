//: operators/Assignment.java
// Assignment with objects is a bit tricky

import java.util.*;

class Tank{
    int level;
}
public class Assignment {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level = "+t1.level+", t2.level = "+t2.level);
        t1 = t2;    // 赋值引用 t1 t2 都指向了同一个对象
        //t1.level = t2.level;  //  赋值
        System.out.println("1: t1.level = "+t1.level+", t2.level = "+t2.level);
        t1.level = 27;
        System.out.println("1: t1.level = "+t1.level+", t2.level = "+t2.level);
    }
}
