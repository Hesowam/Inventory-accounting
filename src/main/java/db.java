import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    private static Connection  connection = null;
    private static String URL = "jdbc:mysql://localhost:3306;instanceName=inventory-accounting;databaseName=localdb;";
    private static String USERNAME = "root";
    private static String PASSWORD = "1111";

    public static void main(String[] args) {
        try {
            System.out.println("DataBase connection");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
