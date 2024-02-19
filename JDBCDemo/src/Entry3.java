import java.sql.*;

public class Entry3 {
    public static void main(String args[]) {
    try {
//        Class.forName("oracle.jdbc.OracleDriver.person");

        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");

        Statement statement = connection.createStatement();
        int resultSet1=statement.executeUpdate("Select * from b",7);
        ResultSet resultSet = statement.executeQuery("Select * from b");
        while (resultSet.next()) {
            System.out.println("ID :" + resultSet.getInt(1)+" "+resultSet1);
        }
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
}
