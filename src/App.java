import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3307/jdbc";
        String userName = "root";
        String password = "kkjjss103@";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select *from users");

        resultSet.next();
        String name=resultSet.getString("name");
        System.out.println(name);

        resultSet.close();
        statement.close();
        connection.close();
    }
}