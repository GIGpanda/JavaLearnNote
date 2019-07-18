//: operators/EqualsMethod2
// Default equals() does not compare contents.
class Value{
    int i;
}
public class EqualsMethod2 {
    public static void main(String[] args){
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));  // equals()的默认行为是比较引用
    }
}
// 大多数 Java 类库都实现了equals()方法，用来比较对象的内容，而非比较对象的引用