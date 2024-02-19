package BatchStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("oracle.jdbc.driver.OracleDriver");
//        creating connection
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
//        statement.addBatch("Insert into employee1 values(67,'sanket',4535)");
//        statement.addBatch("Insert into employee1 values(68,'rajnikant',4535)");
        statement.addBatch("delete  from employee1 where eid=89");
        statement.executeBatch();
        connection.commit();
        connection.close();
    }

}
