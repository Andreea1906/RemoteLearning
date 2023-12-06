public class ConnectionManager {
    private static final int MAX_CONNECTIONS = 5;
    private static Connection[] connections = new Connection[MAX_CONNECTIONS];
    private static int connectionIndex = 0;

    public static Connection getConnection() {
        if (connectionIndex < MAX_CONNECTIONS) {
            Connection newConnection = new Connection(connectionIndex);
            connections[connectionIndex++] = newConnection;
            return newConnection;
        } else {
            System.out.println("No available connections.");
            return null;
        }
    }
}
