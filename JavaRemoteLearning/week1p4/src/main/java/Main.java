

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Connection connection = ConnectionManager.getConnection();
            if (connection != null) {
                connection.connect();
                connection.close();
            } else {
                System.out.println("Failed to obtain a connection.");
            }

        }
    }
}
