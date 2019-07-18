//: access/ChocolateChip.java
// Can't use package-access member from anoter package
import panda.util.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }
    public void chomp() {
        //bite(); // Can't access bite
        // bite() protected 继承访问权限 就可以使用了
        /*
        由于bite() 有包访问权限而且它位于另外一个包内，所以我们在这个包内是无法使用它的
         */
    }
    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
