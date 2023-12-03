package threads;

class Cake extends Thread {
    public void run() {
        System.out.println("prepare ingredients for cake" + Cake.currentThread().getId());
        System.out.println("baking the cake" + Cake.currentThread().getId());
        System.out.println("decorate the cake" + Cake.currentThread().getId());
    }
}

public class ThreadBaking {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++) {
            Cake c = new Cake();
            c.start();
            c.run();
        }
    }
}
