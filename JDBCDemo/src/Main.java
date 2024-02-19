import oracle.jdbc.OracleConnectionWrapper;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","HR","hr");
            Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from STUDENT_DETAILS");

            while (resultSet.next())
            {
                System.out.println("Roll number :"+resultSet.getInt(1));
            }

        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}