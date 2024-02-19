package CURDOperation;

import java.sql.*;

public class CreateTableDemo {
    public static void main(String args[]) {
        try {
//        Class.forName("oracle.jdbc.OracleDriver");

            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");

            Statement statement = connection.createStatement();

//            statement.execute("CREATE TABLE employees7("
//                    + "id NUMBER(5) PRIMARY KEY, "
//                    + "first_name VARCHAR2(50), "
//                    + "last_name VARCHAR2(50), "
//                    + "email VARCHAR2(100), "
//                    + "hire_date DATE)");
//            System.out.println("table created sucessfully");

//
            statement.executeUpdate("Insert into employees7 values(1,'sanket','kurkute','sanketkurkute888@gmail.com','21-06-1997')");
            ResultSet rowsImpacted=statement.executeQuery("Select * from employees7");
            while (rowsImpacted.next())
            {
                System.out.println("Id"+rowsImpacted.getInt(0)+" First name "+rowsImpacted.getString(1)+" Last name "+rowsImpacted.getString(2)+" Email "+rowsImpacted.getString(3)+" Hire Date "+rowsImpacted.getDate(4));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
