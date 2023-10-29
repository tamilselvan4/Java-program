package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        Box b1 = new Box(4);
        Box b2 = new Box(9.9, 10.0, 89.0);
        Box b3 = new Box(b2);

        System.out.println(b.h + " " + b.l + " " + b.w);
        System.out.println(b1.h + " " + b1.l + " " + b1.w);
        System.out.println(b3.h);

        Box box = new BoxWeight();
        System.out.println(box.h);

        BoxWeight box1 = new Box();
        
        BoxPrice box2 = new BoxPrice();

        System.out.println(b.getI());
    }
}
