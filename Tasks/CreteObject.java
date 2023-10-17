package Tasks;
import java.util.HashSet;
import java.util.Set;

public class CreteObject {


    private static Set<Class> instances = new HashSet<>();
    public CreteObject() {
        if (instances.contains(this.getClass())) {
            throw new IllegalStateException("Object is already created");
        }
        instances.add(getClass());
    }
}

class B extends CreteObject {
    
}

class C extends CreteObject {
    
}

class CreateObject {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B();
    }
}