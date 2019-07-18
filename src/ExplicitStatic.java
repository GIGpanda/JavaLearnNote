//: initialization/ExplicitStatic
// Explicit static initialiation with the "static" clause
class Cup{
    Cup(int marker){
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}
class Cups{
    static Cup cup1;
    static Cup cup2;
    static{   // 静态子句 静态块
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){     // 只有在创建了 Cups 对象时 才会执行构造器初始化
        System.out.println("Cups()");   // 直接访问对象的静态成员 则不会执行构造器初始化
    }
}
public class ExplicitStatic {
    public static void main(String[] args){
        System.out.println("inside main()");
        Cups.cup1.f(99);  // 访问静态的cup1对象  静态块被执行
    }
    // static Cups cups1 = new Cups();  // 先是静态初始化 然后是构造器初始化(因为new了一个对象)
    // static Cups cups2 = new Cups();
}
