//: initialization/OrderOfInitilization
// Demonstrates initialization order
// when the constructor is called to create a
// window object, you'll see a message
// 变量定义的顺序决定了初始化的顺序，即使变量定义散布与方法定义之间
// 它们仍旧会在任何方法（包括构造器）被调用之前得到初始化
class Window{
    Window(int marker){
        System.out.println("Window("+ marker +")");
    }
}
class House{
    Window w1 = new Window(1);  // before constructor
    House(){                  // 第一次引用的对象被丢弃，被作为垃圾回收
        System.out.println("House()");
        w3 = new Window(33);  // reinitialize w3
    }
    Window w2 = new Window(2);  // After constructor
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);  // At end
}
public class OrderOfInitialization {
    public static void main(String[] args){
        House h = new House();
        h.f();   // Shows that construction is done
    }
}
