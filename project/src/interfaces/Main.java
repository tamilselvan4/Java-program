package interfaces;

public class Main {
    
    public static void main(String[] args) {
        Engine car = new Car();
        
        // car.a;
        car.acc();
        car.start();
        car.stop();

        Media myMedia = new Car();
        myMedia.stop();

        NiceCar niceCar = new NiceCar();
        
        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeElectric();
        niceCar.start();
    }
}
