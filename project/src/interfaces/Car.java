package interfaces;

public class Car implements Engine, Brake, Media{

    public int a = 10;

    @Override
    public void acc() {
        System.out.println("I accelarate like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }
    
}
