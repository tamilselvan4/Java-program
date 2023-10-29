package properties.inheritance;

public class BoxWeight extends Box {

    double weight;


    BoxWeight() {
        super();
        this.weight = -1;
        System.out.println(w);

    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l,h,w); //it says call the parent class constructor
        this.weight = weight;
        System.out.println(w);
    }
}
