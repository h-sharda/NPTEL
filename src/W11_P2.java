import java.sql.*;
import java.util.Scanner;
public class W11_P2 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Open a connection and check connection status
            conn = DriverManager.getConnection(DB_URL);
            boolean isConnected = conn.isValid(1);

            System.out.print(isConnected);

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}