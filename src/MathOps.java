import java.util.*;

//: operators/MathOps.java
// Demonstrates the mathemtical operators
public class MathOps {
    public static void main(String[] args){
        Random random = new Random(47);
        int i;
        float j;
        i = random.nextInt(100)+1;
        j = random.nextFloat();
        System.out.println("i = " + i + " j = " + j);
    }
}
