package com.nagarro.remotelearning.week9p1.model;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LogServer {
    private final Queue<LogMessage> messageQueue;

    public LogServer() {
        this.messageQueue = new ArrayBlockingQueue<>(10);
    }

    public void addMessage(LogMessage message) throws InterruptedException {
        synchronized (messageQueue) {
            while (messageQueue.size() >= 10) {
                messageQueue.wait();
            }
            messageQueue.offer(message);
            System.out.println("Message added to the queue: " + message.getMessage());
            messageQueue.notifyAll();
        }
    }

    public synchronized void consumeMessage() throws InterruptedException {
        synchronized (messageQueue) {
            while (messageQueue.isEmpty()) {
                messageQueue.wait();
            }
            LogMessage message = messageQueue.poll();
            System.out.println("Message consumed from the queue: " + message.getMessage());
            messageQueue.notifyAll();
        }
    }
}
