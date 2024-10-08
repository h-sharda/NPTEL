import java.sql.*;
import java.lang.*;
public class W11_P4 {
    public static void main(String[] args) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();

            // The statement containing SQL command to create table "STUDENTS"
            // Execute the statement containing SQL command below this comment

            String createTableCommand = "CREATE TABLE IF NOT EXISTS STUDENTS ("
                    + "UID INT PRIMARY KEY NOT NULL, "
                    + "Name VARCHAR(255), "
                    + "Roll VARCHAR(255), "
                    + "Age INT)";

            stmt.executeUpdate(createTableCommand);
            stmt.close();

        }
        catch(Exception e){ System.out.println(e);}
    }
}