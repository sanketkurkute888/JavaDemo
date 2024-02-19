package JDBCAddon;

import java.sql.*;
import java.util.Scanner;

public class JDBCAddon {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","HR","hr");
            statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

//            System.out.println("Enter the subject id");
//            int sId=scanner.nextInt();

//            System.out.println("Enter the Subject name");
//            scanner.nextLine();
//            String sName= scanner.nextLine();
//            System.out.println("Enter the Mark obtained");
//            int mark_obtain=scanner.nextInt();

//            int rowImpacted = statement.executeUpdate("insert into mark values ("+sId+",'"+sName+"',"+mark_obtained+")");
//             int rowImpacted=statement.executeUpdate("update mark set MARK_OBTAIN="+mark_obtain+" where S_ID="+sId);
//           int rowImapacted=statement.executeUpdate("delete from mark where S_ID="+sId);
            resultSet=statement.executeQuery("Select m.* from mark  m");
            System.out.println("S_ID\tSubject Name\tMark");
            resultSet.next();
            System.out.println(resultSet.getInt(1)+"   "+ resultSet.getString(2)+" "+resultSet.getInt(3));
            resultSet.next();
            System.out.println(resultSet.getInt(1)+"   "+ resultSet.getString(2)+" "+resultSet.getInt(3));
            resultSet.next();
            System.out.println(resultSet.getInt(1)+"   "+ resultSet.getString(2)+" "+resultSet.getInt(3));
            resultSet.previous();
            System.out.println(resultSet.getInt(1)+"   "+ resultSet.getString(2)+" "+resultSet.getInt(3));
            resultSet.updateObject(3,77);
            resultSet.updateRow();
        }
        catch(ClassNotFoundException e)
        {
            e.getMessage();
        }
        catch(SQLException e)
        {
          e.printStackTrace();
        }
    }

}
