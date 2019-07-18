//: initialization/VarArgs.java
// Using array syntax to create variable argument lists.

class A{}
public class VarArgs {
    static void PrintArray(Object[] args){
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args){
        PrintArray(new Object[]{    // 所有类都直接或间接继承Object类
                new Integer(47),
                new Float(3.14),
                new Double(11.11),
        });
        PrintArray(new Object[]{"one", "two", "three"});
        PrintArray(new Object[]{new A(), new A(), new A()});
    }
}
