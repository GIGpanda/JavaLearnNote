//: initialization/Mugs.java
// Java "Instance Initialization."

class Mug{
    Mug(int marker){
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}
public class Mugs {
    Mug mug1;
    Mug mug2;     // 实例初始化子句 在构造器之前执行
    {           // 非静态实例初始化 每次 new 一个对象 都会执行一次
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialization");
    }
    Mugs(){    // 每次 new 一个对象 执行对应的构造器
        System.out.println("Mugs()");
    }
    Mugs(int i){
        System.out.println("Mugs(int)");
    }
    public static void main(String[] args){
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
