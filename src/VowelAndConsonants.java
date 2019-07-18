//: control/VowelAndConsonants
// Demonstrates the switch stateme
import java.util.*;

public class VowelAndConsonants {
    public static void main(String[] args){
        Random rand = new Random(47);
        for(int i = 0; i< 100; i++){
            int c = rand.nextInt(26) + 'a';
            char c1 = (char)c;
            System.out.print( c1 + ", " + c + ": ");
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':   // case 语句叠在一起 形成多重匹配 只要符合多种条件的一种
                case 'u': System.out.println("vowel");  // 就会执行那段特别的代码
                          break;
                case 'y':
                case 'w': System.out.println("Sometimes a vowel");
                          break;
                default: System.out.println("consonant");
            }
        }
    }
}
