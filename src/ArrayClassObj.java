//: initialization/ArrayClassObj.java
// Creating an array of nonprimitive objects.
import java.util.*;
public class ArrayClassObj {
    public static void main(String[] args){
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];// 引用数组 非基本类型数组
        System.out.println("length of a = " + a.length);
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500);  // AutoBoxing 自动包装机制
        System.out.println(Arrays.toString(a));
    }
}
