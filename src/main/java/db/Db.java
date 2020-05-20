package db;

public class Db {
     public static String getDatabaseUrl() {
          return DATABASE_URL;
     }
     public static String getDatabaseUser() {
          return DATABASE_USER;
     }
     public static String getDatabasePassword() {
          return DATABASE_PASSWORD;
     }

     private static final String DATABASE_USER = "brt5w8kdguf35l8l";
     private static final String DATABASE_PASSWORD = "pydijz3t17yqbci6";
     private static final String DATABASE_URL = "jdbc:mysql://fojvtycq53b2f2kx.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/fm6wx7cimiutl764"+
            "?verifyServerCertificate=false"+
            "&allowPublicKeyRetrieval=true"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
}
