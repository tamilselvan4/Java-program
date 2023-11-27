package singletonClass;

public class SingletonDemo {
    private SingletonDemo() {

    }

    private static SingletonDemo instance;

    public static SingletonDemo getInstance() {
        if(instance == null) {
            instance = new SingletonDemo();
        }

        return instance;
    }

}
