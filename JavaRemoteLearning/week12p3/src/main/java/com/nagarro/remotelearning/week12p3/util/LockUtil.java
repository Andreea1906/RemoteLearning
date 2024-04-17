package com.nagarro.remotelearning.week12p3.util;

import java.util.concurrent.locks.Lock;
public class LockUtil {

    public void withLock(Lock lock, Runnable action) {
        lock.lock();
        try {
            action.run();
        } finally {
            lock.unlock();
        }
    }
}
