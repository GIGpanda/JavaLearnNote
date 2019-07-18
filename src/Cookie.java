//: access/dessert/Cookie.java
// Creats a library.
package panda.util;

public class Cookie {
    public Cookie() {
        System.out.println("Cookie constructot");
    }
    /*  包访问权限 另外的包无法访问 继承也无法访问
    void bite() {
        System.out.println("bite");
    }
     */
    protected void bite() {  // 也提供包访问权限 而且把对它的额访问权限赋予派生类而不是所有的类
        System.out.println("bite");
    }
}
