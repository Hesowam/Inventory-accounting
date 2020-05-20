package db;

public class Db {
     public static String getDatabaseUrl() {
          return DATABASE_URL;
     }
     private static final String DATABASE_USER = "root";

     public static String getDatabaseUser() {
          return DATABASE_USER;
     }

     public static String getDatabasePassword() {
          return DATABASE_PASSWORD;
     }

     private static final String DATABASE_PASSWORD = "1111";
     private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/inventory-accounting"+
            "?verifyServerCertificate=false"+
            "&allowPublicKeyRetrieval=true"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
}
