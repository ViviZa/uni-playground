package threads;

public class ThreadStart {
    private static Object token = new Object();
    private static volatile int howMuchThreadsAreWaiting;

    //https://www.tutorialspoint.com/java/java_thread_synchronization.htm

    public static void main (String[] args) {
        for (int j = 0; j < 5; j++) {
            System.out.println("Thread" + j);
            //threads running in parallel
            new Thread(() -> {
                for (int i = 1; i < 100; i++) {
                    System.out.println(i);
                    if (i%20 == 0) {
                        synchronized (token) {
                            if(howMuchThreadsAreWaiting > 5 ) {
                                howMuchThreadsAreWaiting = 0;
                                token.notifyAll();
                            } else {
                                try {
                                    token.wait();
                                }catch (InterruptedException ex){
                                    // meh
                                }
                            }
                        }
                    }
                }
            }).start();
        }

    }
}