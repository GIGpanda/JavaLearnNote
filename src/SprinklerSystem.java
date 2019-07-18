//: reusing/SprinkSystem.java
// Compostion for code reuse.

class WaterSource{
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem {
    public String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve3 = " + valve4 + "\n"+
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;  // 编译器只能将一个String对象和另一个String对象相加
    }
    public static void main(String[] args){
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);// 每一个非基本类型的对象都有一个toString() 方法，
    }                                 // 而且当编译器需要一个String而你只有一个对象时，
                                      // 该方法就会被调用
}
