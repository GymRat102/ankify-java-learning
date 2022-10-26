import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestDB {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try {
            runTest();
        } catch (SQLException ex) {
            for (Throwable t : ex)
                t.printStackTrace();
        }
    }

    private static void runTest() throws SQLException, IOException, ClassNotFoundException {

        try (Connection conn = getConnection();
             Statement stat = conn.createStatement()) {
            stat.executeUpdate("CREATE TABLE Greetings (Message CHAR(20))");
            stat.executeUpdate("INSERT INTO Greetings VALUES ('Hello, World!')");

            try (ResultSet result = stat.executeQuery("SELECT * FROM Greetings")) {
                if (result.next()) {
                    System.out.println(result.getString(1));
                }
                // stat.executeUpdate("DROP TABLE Greetings");
            }

        }
    }

    private static Connection getConnection() throws IOException, SQLException, ClassNotFoundException {
        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("database.properties"))) {
           props.load(in);
        }

        String drivers = "com.mysql.cj.jdbc.Driver";
        // String drivers = props.getProperty("jdbc.drivers");
        Class.forName(drivers);

        String url = "jdbc:mysql://localhost:13306/COREJAVA";
        String username = "root";
        String password = "p@ssword";
        // String url = props.getProperty("jdbc.url");
        // String username = props.getProperty("jdbc.username");
        // String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }
}
