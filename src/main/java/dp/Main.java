package dp;

import dp.singleton.DBConnection;
import dp.singleton.DBConnectionSingleton;

public class Main {


    public static void main(String[] args) {
        DBConnectionSingleton.getInstance().executeQuery("");
        DBConnectionSingleton.getInstance().executeQuery("");
        DBConnectionSingleton.getInstance().executeQuery("");
        DBConnectionSingleton.getInstance().executeQuery("");
        DBConnectionSingleton.getInstance();


    }
}
