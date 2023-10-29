package staticDemo;

//how to initialize static varibles
public class staticBlock {
    static int a = 10;
    static int b;

    static {
        System.out.println("I am in static block");
        b = a + 10;
    }

    public static void main(String[] args) {
        staticBlock s = new staticBlock();
        System.out.println(staticBlock.a + staticBlock.b);

        b = b + 5;
        System.out.println(staticBlock.a + staticBlock.b);

        staticBlock s1 = new staticBlock();
        System.out.println(staticBlock.a + staticBlock.b);


    }
}
