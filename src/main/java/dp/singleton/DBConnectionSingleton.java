package dp.singleton;

public class DBConnectionSingleton {

    private static DBConnectionSingleton instance;
    private DBConnectionSingleton() {
        System.out.println("new Instance is getting created");
        connect();
    }

    public static DBConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DBConnectionSingleton();
        }
        return instance;
    }

    private void connect(){
        System.out.println("New Connection to the DB");
    }

    public void executeQuery(String query) {
        System.out.println("Executing the query: " + query);
    }

    public void close() {
        System.out.println("Closing the connections");
    }
}
