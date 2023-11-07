package interfaces.extendInterface;

public interface Child {
    default void function() {
        System.out.println("i am from child");
    }
    void print();
}
