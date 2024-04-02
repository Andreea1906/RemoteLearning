package com.nagarro.remotelearning.week9p1;

import com.nagarro.remotelearning.week9p1.model.*;

public class Main {
    public static void main(String[] args) {
        LogServer server = new LogServer();

        for (int i = 1; i <= 5; i++) {
            Thread clientThread = new Thread(new LogClient(server), "Client-" + i);
            clientThread.start();
        }

        Thread serverThread = new Thread(() -> {
            try {
                while (true) {
                    server.consumeMessage();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Server");
        serverThread.start();
    }
}
