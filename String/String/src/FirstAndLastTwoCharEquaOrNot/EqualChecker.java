package FirstAndLastTwoCharEquaOrNot;

public class EqualChecker {
    public boolean FirstInLast(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
            {
                return true;
            }
          else
            {
                return false;
            }
        }

    }

}
