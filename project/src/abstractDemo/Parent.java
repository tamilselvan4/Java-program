package abstractDemo;

public abstract class Parent {

    int num;

    Parent(int num) {
        this.num = num;
    }

    abstract void career(String name);
    abstract void friend(String name, int age);
    
    //using static method in abstract class
    static void print() {
        System.out.println("hello");
    }
}
