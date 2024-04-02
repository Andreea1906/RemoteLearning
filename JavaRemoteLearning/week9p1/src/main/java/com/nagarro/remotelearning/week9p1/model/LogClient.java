package com.nagarro.remotelearning.week9p1.model;

import java.util.Random;

public class LogClient implements Runnable {
    private final LogServer server;
    private final Random random;

    public LogClient(LogServer server) {
        this.server = server;
        this.random = new Random();
    }

    @Override
    public void run() {
        try {
            while (true) {
                String messageContent = "Log message from client " + Thread.currentThread().getName();
                LogMessage message = new LogMessage(messageContent);
                server.addMessage(message);
                Thread.sleep(random.nextInt(2000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
