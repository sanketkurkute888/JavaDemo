package CURDOperation;


import java.sql.*;
import java.util.Scanner;

public class d {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter employee id:");
            int id = scanner.nextInt();

            scanner.nextLine(); // Consume newline character left after nextInt()

            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();

            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter email:");
            String email = scanner.nextLine();

            System.out.println("Enter hire date (yyyy-mm-dd):");
            String hireDateStr = scanner.nextLine();
            Date hireDate = Date.valueOf(hireDateStr);

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees7");

            // Moving the cursor to the first row
            if (resultSet.first()) {
                do {
                    System.out.println("Id: " + resultSet.getInt(1) + " First name: " + resultSet.getString(2) +
                            " Last name: " + resultSet.getString(3) + " Email: " + resultSet.getString(4) +
                            " Hire Date: " + resultSet.getDate(5));
                } while (resultSet.next());
            }

            // Moving the cursor to the last row
            if (resultSet.last()) {
                System.out.println("Last Record -> Id: " + resultSet.getInt(1) + " First name: " + resultSet.getString(2) +
                        " Last name: " + resultSet.getString(3) + " Email: " + resultSet.getString(4) +
                        " Hire Date: " + resultSet.getDate(5));
            }

            // Moving the cursor after the last row
            resultSet.afterLast();
            System.out.println("After Last Record ->");
            while (resultSet.previous()) {
                System.out.println("Id: " + resultSet.getInt(1) + " First name: " + resultSet.getString(2) +
                        " Last name: " + resultSet.getString(3) + " Email: " + resultSet.getString(4) +
                        " Hire Date: " + resultSet.getDate(5));
            }

            // Moving the cursor to the fifth row
            resultSet.absolute(5);
            System.out.println("Fifth Record -> Id: " + resultSet.getInt(1) + " First name: " + resultSet.getString(2) +
                    " Last name: " + resultSet.getString(3) + " Email: " + resultSet.getString(4) +
                    " Hire Date: " + resultSet.getDate(5));

            // Moving the cursor before the first row
            resultSet.beforeFirst();
            System.out.println("Before First Record ->");
            while (resultSet.next()) {
                System.out.println("Id: " + resultSet.getInt(1) + " First name: " + resultSet.getString(2) +
                        " Last name: " + resultSet.getString(3) + " Email: " + resultSet.getString(4) +
                        " Hire Date: " + resultSet.getDate(5));
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
