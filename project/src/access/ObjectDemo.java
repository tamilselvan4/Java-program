package access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //finalize called when the garbage collector is hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        // return super.hashCode();
        return num;
    }


    // toString gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo ob = new ObjectDemo(30);
        ObjectDemo ob2 = new ObjectDemo(30);

        System.out.println(ob.getClass());

        System.out.println(ob.hashCode());
        System.out.println(ob2.hashCode());

        if(ob == ob2) {
            System.out.println("ob1 and ob2 is equal");
        }

        if(ob.equals(ob2)) {
            System.out.println("ob1 and ob2 is equal");
        }

    }

    
    
}