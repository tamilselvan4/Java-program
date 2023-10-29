package staticDemo;

class B {
    int a;
        String name;

        B(String name) {
            this.name = name;
        }
}

public class InnerClass {

    class A {
        int a;
        String name;

        A(String name) {
            this.name = name;
        }
    }
    
    public static void main(String[] args) {
        B b = new B("tamil");
        A a = new A("tamil"); //we need to create object for the innerclass
        //because A is inside the innerClass
    }
}
