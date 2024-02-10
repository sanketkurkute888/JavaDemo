public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int temp=number%10 ;
        int rem=0;
        while (number > 0) {
            rem=number%10;
            number=number/10;
        }
        return temp+rem;
    }

    public static void main(String[] args) {
        System.out.println( sumFirstAndLastDigit(71234));
    }
}
