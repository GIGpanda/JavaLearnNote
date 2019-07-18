//: operators/Overflow.java
// Superise! Java lets you Overflow.
public class Overflow {
    public static void main(String[] args){
        double maxdouble = Double.MAX_VALUE;
        double mindouble = Double.MIN_VALUE;
        float maxfloat = Float.MAX_VALUE;
        float minfloat = Float.MIN_VALUE;
        System.out.println("maxdouble: " + maxdouble);
        System.out.println("mindouble: " + mindouble);
        System.out.println("maxfloat: " +


                maxfloat);
        System.out.println("minflat: " + minfloat);
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
