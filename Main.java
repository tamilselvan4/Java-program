class a {
    // Static flag to track if an object has been created
    private static boolean objectCreated = false;

    public a() {
        if (objectCreated) {
            throw new IllegalStateException("Object of class a already created.");
        }
        objectCreated = true;
    }
}

class b extends a {
    // Subclass of a
}

public class Main {
    public static void main(String[] args) {
            b obj1 = new b();
            System.out.println("Object 1 created successfully.");
        try {
            // Create an object of class b

            // Try to create another object of class b, which should throw an exception
            b obj2 = new b();
            System.out.println("Object 2 created successfully.");
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
