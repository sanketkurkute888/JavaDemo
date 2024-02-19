package BatchStatement;

import java.sql.*;
import java.util.Scanner;

public class BatchDemo {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        ResultSet resultSet = null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");

//            preparedStatement = connection.prepareStatement("create table employee1 (eid number constraint eidPK primary key, name varchar2(50), salary number)");
//            scanner = new Scanner(System.in);
//            System.out.println("Enter eid");
//            int eid = scanner.nextInt();
//            System.out.println("Enter name");
//            String name = scanner.next();
//            System.out.println("Enter salary");
//            double salary = scanner.nextDouble();

//
//            preparedStatement = connection.prepareStatement("insert into employee1 values(?, ?, ?)");
//            preparedStatement.setInt(1, eid);
//            preparedStatement.setString(2, name);
//            preparedStatement.setDouble(3 , salary);

//            preparedStatement = connection.prepareStatement("update employee1 set salary = ? where eid = ?");
//            preparedStatement.setInt(2, eid);
//            preparedStatement.setDouble(1, salary);

//            preparedStatement = connection.prepareStatement("select * from employee1");
//            resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt(1)+"-----"+resultSet.getString(2)+"------" +
//                        resultSet.getDouble(3));
//            }
//
//            preparedStatement = connection.prepareStatement("delete from employee1 where eid = ?");
//            preparedStatement.setInt(1, eid);
//            preparedStatement.setDouble(1, salary);
//            preparedStatement.executeUpdate();

            /***************************************************************************************/
            // scanner = new Scanner(System.in);

            //preparedStatement = connection.prepareStatement("insert into employee values(?, ?, ?)");

//            for(int i=1; i<=1; i++){
//                System.out.println("Enter eid");
//                int eid = scanner.nextInt();
//                System.out.println("Enter name");
//                String name = scanner.next();
//                System.out.println("Enter salary");
//                double salary = scanner.nextDouble();
//
//
//                preparedStatement.setInt(1, eid);
//                preparedStatement.setString(2, name);
//                preparedStatement.setDouble(3, salary);
//
//                preparedStatement.executeUpdate();
//
//            }

            /************Batch Processing - Prepared Statement*****************************/
//
            scanner = new Scanner(System.in);
            preparedStatement = connection.prepareStatement("insert into employee1 values(?, ?, ?)");



            for(int i=1; i<=2; i++) {
                System.out.println("Enter eid");
                int eid = scanner.nextInt();
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Enter salary");
                double salary = scanner.nextDouble();

                preparedStatement.setInt(1, eid);
                preparedStatement.setString(2, name);
                preparedStatement.setDouble(3, salary);


                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();

//            for(int i=1; i<=1; i++){
//                System.out.println("Enter eid");
//                int eid = scanner.nextInt();
//                System.out.println("Enter name");
//                String name = scanner.next();
//                System.out.println("Enter salary");
//                double salary = scanner.nextDouble();
//
//
//                preparedStatement.setInt(1, eid);
//                preparedStatement.setString(2, name);
//                preparedStatement.setDouble(3, salary);
//
//                preparedStatement.executeUpdate();

//            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(preparedStatement != null)
                preparedStatement.close();
            if(connection != null)
                connection.close();
            if(scanner != null)
                scanner.close();
            if(resultSet != null)
                resultSet.close();
        }
    }
}
