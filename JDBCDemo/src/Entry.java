import oracle.jdbc.OracleConnectionWrapper;

import java.sql.*;

public class Entry {
    public static void main(String[] args) {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","HR","hr");
            Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from STUDENT_DETAILS");

            while (resultSet.next())
            {
                System.out.println("Roll number :"+resultSet.getInt(1)+" Name "+resultSet.getString(2)+" Marks :"+resultSet.getInt(3));
            }


          //conn.setAutoCommit(false);
          //conn.commit();
            resultSet.close();

            statement.close();
            conn.close();


        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}