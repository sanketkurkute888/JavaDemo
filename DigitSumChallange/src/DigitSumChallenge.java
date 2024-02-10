public class DigitSumChallenge {
    public static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println( digitSum(1115));
    }
}
