package com.nagarro.remotelearning.week12p3;

import com.nagarro.remotelearning.week12p3.util.LockUtil;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        Lock myLock = new ReentrantLock();
        LockUtil lockUtil = new LockUtil();

        lockUtil.withLock(myLock, () -> {

            System.out.println("Action executed inside lock");
        });
    }
}
