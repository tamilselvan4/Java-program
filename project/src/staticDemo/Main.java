package staticDemo;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("tamil", 21, 200000, false);
        Human h2 = new Human("rahul", 21, 100000, true);

        System.out.println(h1.population);
        System.out.println(h2.population);

        // print();

        Main m = new Main();
        m.fun2();
    }

    static void fun() {
        System.out.println("welcome");

        System.out.println(this.name); //don

        //We can use like this
        Main m = new Main();
        m.print();
    }

    void fun2() {
        print();
    }

    void print() {
        fun(); //we can use static method in not static method
        System.out.println("Hello world");
    }
}
