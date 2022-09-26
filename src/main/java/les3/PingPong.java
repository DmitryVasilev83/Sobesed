package les3;

public class PingPong extends Thread{


    private String msg = "Ping";

    public void print(String inMsg, String nextMsg) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                while (!msg.equals(inMsg)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                sleep(100);
                System.out.print(inMsg);
                msg = nextMsg;
                notifyAll();
            }
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
