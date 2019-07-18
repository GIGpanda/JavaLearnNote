//: initialization/ArrayNew.java
//Creating arrays with new.
import java.util.*;
public class ArrayNew {
    public static void main(String[] args){
        //int[] a;
        Random rand = new Random(47);
        //a = new int[rand.nextInt(20)];
        int[] a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a)); // 产生一维数组的可打印版本
    }
}
