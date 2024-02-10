import java.util.Scanner;

public class ConsoleScanning {
    public static void main(String[] args) {
//        String stringFirstNumber = System.console().readLine("Enter 1st number\n");
//        String stringSecondNumber = System.console().readLine("Enter 2nd number\n");
//
//        int a = Integer.parseInt(stringFirstNumber);
//        int b = Integer.parseInt(stringSecondNumber);
//
//        System.out.println(a+b);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int a = scanner.nextInt();
//
//
//        System.out.println("Enter 2nd number");
//        int b = scanner.nextInt();
//
//        System.out.println(a + b);

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter any number");
//        int number = scanner.nextInt();
//
//        int fact = 1;
//        for(int i = 1; i<= number; i++){
//            fact = fact * i;
//        }
//
//        System.out.println("Factorial is "+fact);

        Time time1 = new Time(10, 20, 30);
        System.out.println(time1);

        Time time2 = new Time();
        System.out.println(time2);

        Time time3 = new Time(0,7, 15);
        System.out.println(time3);


        Time time4 = new Time(7,7, 15);
        System.out.println(time4);

//        PersonRecord person = new PersonRecord(20, "Abc", 20000);
//        System.out.println(person.age());



    }
}
