package com.nagarro.remotelearning.week9p1.model;

import java.util.LinkedList;
import java.util.Queue;

public class LogServer {
    private final Queue<String> logQueue;
    private final int maxQueueSize;

    public LogServer(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        this.logQueue = new LinkedList<>();
    }

    public synchronized void addLog(String logMessage) throws InterruptedException {
        while (logQueue.size() >= maxQueueSize) {
            wait();
        }
        logQueue.add(logMessage);
        notify();
    }

    public synchronized String getLog() throws InterruptedException {
        while (logQueue.isEmpty()) {
            wait();
        }
        String logMessage = logQueue.poll();
        notify();
        return logMessage;
    }
}
