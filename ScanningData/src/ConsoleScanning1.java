import java.util.Scanner;

public class ConsoleScanning1 {
    public static void main(String[] args) {
//        String stringFirstNumber = System.console().readLine("Enter the first number");
//        String stringSecondNumber = System.console().readLine("Enter the first number");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();
        System.out.println(a+b);

        System.out.println("Enter the third number");
        float c=scanner.nextFloat();
        System.out.println(a+c);

        System.out.println("Enter the forth number");
        double d=scanner.nextDouble();
        System.out.println(a+d);


    }
}
