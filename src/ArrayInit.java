//: initialization/ArrayInit.java
// Array initialization
import java.util.*;
public class ArrayInit {
    public static void main(String[] args){
        Integer[] a = {    //只能用于数组被定义处
                new Integer(1),
                new Integer(2),
                3,   // AutoBoxing
        };
        Integer[] b = new Integer[]{   //可以在任何地方使用 甚至是在调用方法的内部
                new Integer(1),
                new Integer(2),
                3,   // AutoBoxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
