package properties.polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();

        shape.area();
        circle.area();
    }
}
