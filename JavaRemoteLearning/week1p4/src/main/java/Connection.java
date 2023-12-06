public class Connection {
        private int connectionId;

        public Connection(int id) {
            this.connectionId = id;
        }

        public void connect() {
            System.out.println("Connected to Connection " + connectionId);
        }

        public void close() {
            System.out.println("Closed Connection " + connectionId);
        }
    }

