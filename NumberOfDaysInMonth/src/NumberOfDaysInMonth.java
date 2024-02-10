public class NumberOfDaysInMonth {
    public boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int getDaysInMonth(int month, int year)
    {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999))
        {
            return -1;
        }
        else
        {
            if (isLeapYear(year))
            {
                    return switch (month)
                    {
                        case 1, 3, 5, 7, 8, 10, 12:
                            yield 31;
                        case 4, 6, 11, 9:
                            yield 30;
                        case 2:
                            yield 29;
                        default:
                            yield -1;
                    };
            }
            else
            {
                return 28;
            }
        }
    }
}
