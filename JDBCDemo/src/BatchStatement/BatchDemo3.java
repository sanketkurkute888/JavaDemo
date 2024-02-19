package BatchStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchDemo3 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            PreparedStatement preparedStatement = null;
            Connection connection=null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");

            while (true) {
                System.out.println("Enter the employee id");
                int eid = scanner.nextInt();

                System.out.println("Enter the employee name");
                scanner.nextLine();
                String ename = scanner.nextLine();
                System.out.println("Enter the salary ");
                Double salary = scanner.nextDouble();


                preparedStatement = connection.prepareStatement("insert into employee1 values(?,?,?)");
                preparedStatement.setInt(1, eid);
                preparedStatement.setString(2, ename);
                preparedStatement.setDouble(3, salary);

                preparedStatement.addBatch();

                System.out.println("Do  you want to continue to insert y/n ");
                scanner.nextLine();
                String ans=scanner.nextLine();
                if(ans.equals("n")){
                    break;
                }

            }
            preparedStatement.executeBatch();
            preparedStatement.close();
            connection.close();
            scanner.close();


        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException r) {
            System.out.println(r);
        }


    }

}


//import java.sql.*;
//        import java.io.*;
//
//class BP {
//    public static void main(String args[]) {
//        try {
//
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
//
//            PreparedStatement ps = con.prepareStatement("insert into user420 values(?,?,?)");
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            while (true) {
//
//                System.out.println("enter id");
//                String s1 = br.readLine();
//                int id = Integer.parseInt(s1);
//
//                System.out.println("enter name");
//                String name = br.readLine();
//
//                System.out.println("enter salary");
//                String s3 = br.readLine();
//                int salary = Integer.parseInt(s3);
//
//                ps.setInt(1, id);
//                ps.setString(2, name);
//                ps.setInt(3, salary);
//
//                ps.addBatch();
//                System.out.println("Want to add more records y/n");
//                String ans = br.readLine();
//                if (ans.equals("n")) {
//                    break;
//                }
//
//            }
//            ps.executeBatch();// for executing the batch
//
//            System.out.println("record successfully saved");
//
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//}