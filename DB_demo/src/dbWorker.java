import java.sql.*;

public class dbWorker {

    private final String HOST_URL = "jdbc:postgresql://localhost:5432/cquoi";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "dbp2020wesh";

    private Connection connection = null;

    public dbWorker() {
        try {
            //Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(HOST_URL, USERNAME, PASSWORD);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
