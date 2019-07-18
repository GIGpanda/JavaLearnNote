//: initialization/ArraysOfPrimitives

public class ArraysOfPrimitives {
    public static void main(String[] args){
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;  // 不能指定大小 只是声明了一个数组的引用
        a2 = a1;   // 将一个数组复制给另一个数组 其实只是复制了引用
        for(int i = 0; i < a2.length; i++)   // a1 a2 是相同数组的别名
            a2[i] = a2[i] + 1;
        for(int i = 0; i < a1.length; i++)
            System.out.println("a1[" + i + "] = " + a1[i]);
    }
}
