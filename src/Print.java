//: net/mindview/util/Print.java
// Print methods that can be used without
// qualifiers, using Java SE5 static imports:
package panda.util;
import java.io.*;
public class Print {
    // Print with a new line:
    public static void print(Object obj) {
        System.out.println(obj);
    }
    // Print a new line by itself:
    public static void print() {
        System.out.println();
    }
    // Print with no lines break:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    // The SE5 printf() (from C) :
    public static PrintStream printf(String format, Object... args) {  // 可变参数列表
        return System.out.printf(format, args);
    }
}
