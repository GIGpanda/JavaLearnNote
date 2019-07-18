//: access/IceCream.java
// Demonstrates "private"  keyword.

import sun.security.provider.Sun;

class Sundae{
    private Sundae() {}
    static Sundae makeASundae() {
        return new Sundae();
    }
    /*
    和 Sundae makeASundae() 的区别
    无法从静态上下文引用非静态方法
    reason: 在静态方法中不能直接调用非静态的方法和属性，一个静态类的Class文件在被加载之后，
    就可以由这个Class类型对象直接调用，而非静态方法需要一个实例对象，有可能还未创建。
    为了避免在静态方法中调用一个尚未存在的实例对象的非静态方法，编译器会阻止这个行为。
     */
}
public class IceCream {
    public static void main(String[] args){
        //! Sundae x = new Sundae();

        Sundae x = Sundae.makeASundae();
    }
}
