//: reusing/Chess.java
// Inheritance, constructots and arguments.

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game{
    BoardGame(int i) {
        super(i);  // 如果没有默认的基类构造器，或者想调用一个带参数的基类构造器，
        // 就必须使用关键字super显示地编写调用基类构造器的语句，并且配以适当的参数列表
        System.out.println("BoardGame constructor");
    }
}
public class Chess extends BoardGame {
    Chess() {
        super(11);  // 如果不调用基类构造器，编译器将抱怨无法找到符合Game形式的构造器
        // 而且，调用基类构造器必须是你在导出类构造器中要做的第一件事,如果你做错了 编译器会提醒你
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
