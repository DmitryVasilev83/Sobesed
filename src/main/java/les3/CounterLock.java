package les3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock implements Runnable{
    private Counter resource;
    private Lock lock;

    public CounterLock(Counter r){
        this.resource = r;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            if(lock.tryLock()){
                resource.countIncrease();
            }
        } finally{
            lock.unlock();
        }

    }

}
