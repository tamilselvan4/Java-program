package threads;

public class HelloThreads extends Thread{

    public void run() {
        System.out.println("Hello from thread!");
    }
    public static void main(String[] args) {
        (new HelloThreads()).start();
    }
}
