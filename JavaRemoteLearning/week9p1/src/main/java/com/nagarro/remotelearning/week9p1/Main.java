package com.nagarro.remotelearning.week9p1;

import com.nagarro.remotelearning.week9p1.model.LogConsumer;
import com.nagarro.remotelearning.week9p1.model.LogProducer;
import com.nagarro.remotelearning.week9p1.model.LogServer;

public class Main {
    public static void main(String[] args) {
        LogServer logServer = new LogServer(10);

        // Start log producer threads
        for (int i = 0; i < 3; i++) {
            Thread producerThread = new Thread(new LogProducer(logServer, i));
            producerThread.start();
        }

        // Start log consumer thread
        Thread consumerThread = new Thread(new LogConsumer(logServer));
        consumerThread.start();
    }
}
