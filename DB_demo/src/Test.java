import java.sql.*;

public class Test {
    public static void main(String[] args) {

        dbWorker worker = new dbWorker();
        String sql = "SELECT * FROM user";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()) {

                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                System.out.println(user);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

            }
}
