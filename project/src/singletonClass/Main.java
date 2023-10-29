package singletonClass;

public class Main {
    public static void main(String[] args) {
        
    SingletonDemo s1 = SingletonDemo.getInstance();
    SingletonDemo s2 = SingletonDemo.getInstance();
    SingletonDemo s3 = SingletonDemo.getInstance();

    System.out.println(s1);
    System.out.println(s2);

    }

    


}
