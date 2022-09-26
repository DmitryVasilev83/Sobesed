package les3;

public class CounterApp {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.countIncrease();
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(counter.count);
    }
}
