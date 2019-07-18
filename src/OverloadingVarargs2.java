//: initialization/OverloadingVarargs2
// {CompileTimeError} (won't compile)
public class OverloadingVarargs2 {
    static void f(float i, Character... args){
        System.out.println("first");
    }
    static void f(char c,Character... args){  // 添加一个非可变参数列表
        System.out.println("second");
    }
    /*
    Error
    static void f(Character... args){
        System.out.println("second");
      }
     */
    public static void main(String[] args){
        f(1, 'a');
        f('a', 'b');
    }
}
