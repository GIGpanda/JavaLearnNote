//: operators/StringOperatos.java
public class StringOperators {
    public static void main(String[] args){
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
        System.out.println(" " + x);
    }
}
// 如果表达式以字符串起头，那么后续所有操作数据类型都必须是字符串型，
// 编译器会自动把双引号内的字符序列自动装换成字符串