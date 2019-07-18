//: reusing/Detergent.java
// Inheritace syntax & properties.

class Cleanser {
    private String s = "Cleanser";   //为了继承，一般的规则是将所有的数据成员都指定为private
    public void append(String a){    // 将所有方法方法指定为public
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }
    public String toString(){
        return s;
    }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
public class Detergent extends Cleanser {
    // change a method:
    public void scrub() {   // 使用基类中定义的方法及对它进行修改是可行的
        append(" Detergent.scrub()");
        super.scrub();   // Java用super关键字 表示超类的意思 当前类就是从超类继承来的
    }   // 为此,表达式 super.scrub() 将调用基类版本的scrub() 方法
    // Add methods to the interface:
    public void foam() {
        append(" foam()");
    }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
