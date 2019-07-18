//: reusing/Bath.java
// Constructor initialization with composition.

class Soap{
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class Bath {
    // Initialization at point of definition
    // 1: 在定义对象的地方。这意味着它们总是能够在构造器被调用之前初始化。
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {   // 2: 构造器初始化
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    // Instance initialization:   3: 实例初始化
    {
        i = 47;
    }
    public String toString() {
        if(s4 == null) // Delayed initialization:  4 惰性初始化
            s4 = "Joy";  // 就在对象正要使用之前。在生成对象不值得及不必要每次
        return          // 都要生成对象的情况下，这种方式可以减少额外的负担
                "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }
    public static void main(String[] args){
        Bath b = new Bath();
        System.out.println(b);
    }
}
