package interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new MusicPlayer();

    NiceCar() {
        engine = new PowerEngine();
    }

    NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void upgradeElectric() {
        this.engine = new ElecticEngine();  
    }
}
