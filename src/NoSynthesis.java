//: initialization/NoSynthesis.java
class Bird{
    Bird(int i){}
    Bird(double d){}
}

public class NoSynthesis {
    public static void main(String[] args){
    //  Bird b = new Bird();
      Bird b2 = new Bird(1);
      Bird b3 = new Bird(1.0);
    //  new Bird();
    }
}
