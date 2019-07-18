// object ShowProperties.java
import java.util.*;
public class ShowProperties {
    public static void main(String[] args){
        Properties pro = System.getProperties();
        System.out.println(pro.getProperty("java version"));
        System.out.println(pro.getProperty("user.name"));
        System.out.println(pro.getProperty("java.labrary.path"));
        /*
        System.getProperties().list(System.out);
        System.out.println(System.getPropertie("user.name"));
        System.out.println(System.getPropertie("java.library.path"));
         */
    }
}
