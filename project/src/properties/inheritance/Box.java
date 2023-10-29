package properties.inheritance;

public class Box {
    private double i = 1d;
    double l;
    double h, w;

    double getI() {
        return i;
    }

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side) {
        this.l = side;
        w = side;
        h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    void display() {
        System.out.println("running the box");
    }
}
