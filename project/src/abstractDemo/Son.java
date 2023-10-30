package abstractDemo;

public class Son extends Parent {

    Son(int num) {
        super(num);
    }

    @Override
    void career(String name) {
        System.out.println("I am want to be a " + name);
    }

    @Override
    void friend(String name, int age) {
        System.out.println("My friend name is " + name + "and she is " + age);
    }
    
}
