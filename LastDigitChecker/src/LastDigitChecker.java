public class LastDigitChecker {
    public boolean hasSameLastDigit(int number1, int number2, int number3) {
//        int rem1=number1%10;
//        int rem2=number2%10;
//        int rem3=number3%10;
        if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) && (number3 >= 10 && number3 <= 1000)) {
            if ((number1 % 10 == number2 % 10) || (number1 % 10 == number3 % 10) || (number2 % 10 == number3 % 10)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
