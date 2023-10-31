package threads;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException {

            String Info[] = {
                "Mares eat oats",
                "Does eat oats"
            };

            for(int i = 0; i<Info.length; i++) {
                Thread.sleep(4000);

                System.out.println(Info[i]);
            }

            for( int i = 0; i< Info.length; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    return;
                }
                System.out.println(Info[i]);
            }

            String inputs[] = {"hii", "hello"};
            for(int i = 0; i < inputs.length; i++ ) {
                heavyCrunch(inputs[i]);
            }
        }
    }

