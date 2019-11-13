package threads;

public class ParallelThreads {
    public static volatile boolean alive = true;

    public static void main(String[] args) {
        new Thread (() -> {
            while (alive) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread1 " + i);
                }
            }
        }).start();
        new Thread (() -> {
            for(int i=0; i<10 ; i ++ ) {
                System.out.println("Thread2 " + i);
            }
        }).start();
        alive = false;
        new Thread (() -> {
            for(int i=0; i<10 ; i ++ ) {
                System.out.println("Thread3 " + i);
            }
        }).start();

    }


}