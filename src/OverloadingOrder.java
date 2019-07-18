//: initilization/Overloading.java
// Overloading based on the order of the arguments.
public class OverloadingOrder {   // 区分重载方法 独一无二的参数类型列表
    static void f(String s, int i){
        System.out.println("String : " + s + ", int: " + i);
    }
    static void f(int i , String s){
        System.out.println("int : " + i + " String : " + s);
    }
    public static void main(String[] args){
     f("String first", 11);
     f(99, "int first");
    }
}
