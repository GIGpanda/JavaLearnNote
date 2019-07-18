//: operators/Casting.java
public class Casting {
    public static void main(String[] args){
        int i = 200;
        long lng = (long)i;
        lng = i; // 扩展转换 widening conversion "Widening," so cast not really required
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2; // 窄化转换 narrowing conversion  cast required
    }
}
