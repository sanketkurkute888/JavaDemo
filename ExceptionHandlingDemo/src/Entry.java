import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args){
//        Scanner scanner = null;
        try(Scanner scanner = new Scanner(System.in);
                MyClosable obj = new MyClosable();
        ){
           // scanner  = new Scanner(System.in);
//            System.out.println("Enter date");
//            String date = scanner.next();
//
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
//            simpleDateFormat.parse(date);

//            someFunction();

//            String password = "Hello@123";
//            try {
//                checkPassword(password);
//           }catch (PasswordException e1){
//                e1.printStackTrace();
//            }
//
//            int[] arr = new int[5];
//            System.out.println("Enter any number");
//            int number = scanner.nextInt();
//
//            for(int i=0; i<number; i++){
//                arr[i] = scanner.nextInt();
//            }

//            scanner = null;
//            scanner.next();
        }
//        catch (ParseException | ArrayIndexOutOfBoundsException  e){
//            System.out.println("Exception occurred");
//        }
//        catch(ParseException e){
//            System.out.println("Error in parsing date "+e);
//            e.printStackTrace();
//        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please check the range of array "+e);
            e.printStackTrace();
        }catch (IOException e){
            System.out.println(e);
        }
//        catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        catch (Exception e){
//            System.out.println("Exception occurred "+e);
//        }catch (Throwable e){
//            System.out.println("Throwable exception "+e);
//        }
//        finally {
//            System.out.println("Finally called");
//            if(scanner!=null)
//                scanner.close();
//        }
    }


//    public static void someFunction() throws SQLException{
//        throw new SQLException("Error in SQL syntax");
//        //throw new NullPointerException();
//
//    }

//    public static String checkPassword(String password) throws PasswordException{
//        if(password.contains("@")){
//            System.out.println(Byte.BYTES);
//            return "Password is valid";
//        }
//        throw new PasswordException("Password Invalid: Not contain @");
//    }
}
