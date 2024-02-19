package PreparedStatement;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatemntDemo {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
//        PreparedStatement prepareStatement = null;
        Scanner scanner = new Scanner(System.in);
        PreparedStatement stmt = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");
            System.out.println("Enter the  student id");
            int sId = scanner.nextInt();
            System.out.println("Enter the name of student");
            scanner.nextLine();
            String sName = scanner.nextLine();
            System.out.println("Enter the mark of the student");
            int mark = scanner.nextInt();
            PreparedStatement statement = connection.prepareStatement("insert into mark values(?,?,?)");

            statement.setInt(1, sId);
            statement.setString(2, sName);
            statement.setInt(3, mark);
            statement.execute();

//
//            PreparedStatement statement1 = connection.prepareStatement("Select * from mark");
//
//            ResultSet resultSet = statement1.executeQuery();
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) +" "+ resultSet.getString(2) +" " +resultSet.getInt(3));
//            }


            System.out.println("Enter the  student id");
            int sId1 = scanner.nextInt();
//            System.out.println("Enter the name of student");
//            scanner.nextLine();
//            String sName1 = scanner.nextLine();
//            System.out.println("Enter the mark of the student");
//            int mark1 = scanner.nextInt();

//            PreparedStatement statement2=connection.prepareStatement("update  mark set MARK_OBTAIN=? where S_ID=?");
//            statement2.setInt(1,mark1);
//            statement2.setInt(2,sId1);
//            statement2.executeQuery();


//            PreparedStatement preparedStatement3=connection.prepareStatement("delete  * from mark where S_ID=?");
            PreparedStatement preparedStatement3=connection.prepareStatement("delete from mark where s_id=?");
            preparedStatement3.setInt(1,sId1);
            preparedStatement3.execute();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (connection != null) {
                connection.close();
            }
            if (scanner != null) {
                scanner.close();
            }
        }

    }

}
