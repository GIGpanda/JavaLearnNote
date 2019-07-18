//: initialization/VarargType.java


public class VarargType {
    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    public static void main(String[] args){
        f('a');
        f();  // 如果在该列表中没有任何元素，那么转变成的数据尺寸为0
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
        // 使用可变参数列表不依赖于 自动包装机制,而实际上使用的是基本类型
    }
}
