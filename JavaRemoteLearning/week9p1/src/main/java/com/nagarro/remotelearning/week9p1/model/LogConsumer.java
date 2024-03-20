package com.nagarro.remotelearning.week9p1.model;

public class LogConsumer implements Runnable {
    private final LogServer logServer;

    public LogConsumer(LogServer logServer) {
        this.logServer = logServer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                String logMessage = logServer.getLog();
                System.out.println("Consumer consumed: " + logMessage);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
