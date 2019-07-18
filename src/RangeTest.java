import panda.util.Range.*;
import static panda.util.Print.*;  // 为什么这个必须是静态导入呢

public class RangeTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        a = panda.util.Range.range(10);
        for(int i = 0; i < 10; i++)
            print(a[i]);
    }
}
