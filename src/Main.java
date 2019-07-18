import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger a, b;
        a = cin.nextBigInteger();
        b = cin.nextBigInteger();
        System.out.println(a.subtract(b));
    }
}
