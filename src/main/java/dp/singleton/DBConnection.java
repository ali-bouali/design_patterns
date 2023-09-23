package dp.singleton;

public class DBConnection {

    public DBConnection() {
        connect();
    }

    public void connect(){
        System.out.println("New Connection to the DB");
    }

    public void executeQuery(String query) {
        System.out.println("Executing the query: " + query);
    }

    public void close() {
        System.out.println("Closing the connections");
    }
}
