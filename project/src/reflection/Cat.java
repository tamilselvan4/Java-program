package reflection;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void meow() {
        System.out.println("Meow");
    }

    private void isPrivateMethod() {
        System.out.println("inside private Method");
    }

    public static void publicStatic() {
        System.out.println("inside public static");
    }

    private static void privateStatic() {
        System.out.println("inside private static");
    }
}
