//: initialization/EnunOrder.java

public class EnumOrder {
    public enum Spiciness{
        NOT, MILD, MEDIUM, HOT, FLAMING
    }
    public static void main(String[] args){
        for(Spiciness s : Spiciness.values())
            System.out.println(s + " , ordinal  " + s.ordinal());
    }
}
