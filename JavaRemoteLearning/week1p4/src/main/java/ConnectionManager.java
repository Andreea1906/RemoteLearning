public class ConnectionManager {
    private static final int MAX_CONNECTIONS = 5;
    private static Connection[] connections = new Connection[MAX_CONNECTIONS];
    private static int connectionIndex = 0;

    private ConnectionManager(){

    }

    public static class Connection {
        private Connection() {
        }

        public void connect() {
            System.out.println("Connected to the server.");
        }

        public void disconnect() {
            System.out.println("Disconnected from the server.");
        }

        public static Connection getConnection() {
            if (connectionIndex < MAX_CONNECTIONS) {
                Connection newConnection = new Connection();
                connections[connectionIndex] = newConnection;
                connectionIndex++;
                return newConnection;
            } else {
                System.out.println("No available connections.");
                return null;
            }
        }
    }
}
