//: resuing/Cartoon.java
// Constructor calls during inheritance

class Art{
    Art() {
        System.out.println("Art constructor");
    }
}
class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}
public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();    // 构建过程是从基类向外扩散的
    }              // 所以基类在导出类构造器可以访问它之前,就已经完成了初始化
}

