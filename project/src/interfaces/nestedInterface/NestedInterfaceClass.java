package interfaces.nestedInterface;

public class NestedInterfaceClass {
    public interface InnerNestedInterface {
        boolean isOdd(int num);
    }
}


class B implements NestedInterfaceClass.InnerNestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }

}