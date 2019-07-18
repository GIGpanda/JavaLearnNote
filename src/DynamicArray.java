//: initialization/DynamicArray.java
// Array initialization.
public class DynamicArray {
    public static void main(String[] args){
        Other.main(new String[]{"fiddle", "de", "dum"});  // 为什么这个传不了参数 但是 thinkinginjava上面写的能传递
        String[] s = new String[]{
                "fiddle",
                "de",
                "dum",
        };
        Other.main(s);
    }
}
class Other{
    public static void main(String[] args){
        System.out.println("Yes");
        System.out.println(args.length);
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        for(String s : args)
            System.out.println(s + " ");
    }
}
