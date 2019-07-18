//: operators/Passobject.java
// Passing objects to methods may not be
// what you're used to.

import java.util.*;

class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }
    public static void main(String[] args){
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c = "+x.c);
        f(x);  //传递引用
        System.out.println("2: x.c = "+x.c);
    }
}
