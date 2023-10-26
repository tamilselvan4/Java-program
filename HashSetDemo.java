import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("AA");
        hs.add("BB");

        //adding dupliate is not allowed
        boolean x = hs.add("CC");
        System.out.println(x);
        boolean y = hs.add("CC");
        System.out.println(y);
        System.out.println(hs);

        //contains
        System.out.println("Does the list contains CC or not?" + hs.contains("CC"));

        //remove
        hs.remove("AA");
        System.out.println("After removing AA: " + hs);
        // hs.remove(1);
        System.out.println(hs);
    }
}
