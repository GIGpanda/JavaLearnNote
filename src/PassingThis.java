//: initializaton/PassingThis.java

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);  // 传递自身 this
    }
}
public class PassingThis {
    public static void main(String[] args){
        new Person().eat(new Apple());
    }
}
