package com.nagarro.remotelearning.week9p1.model;

public class LogProducer implements Runnable{
    private final LogServer logServer;
    private final int nodeId;

    public LogProducer(LogServer logServer, int nodeId) {
        this.logServer = logServer;
        this.nodeId = nodeId;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                String logMessage = "Node " + nodeId + " - Log Message " + i;
                logServer.addLog(logMessage);
                System.out.println("Node " + nodeId + " produced: " + logMessage);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
