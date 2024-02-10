import java.util.Locale;

public class QuaterMonthCheker {
    public String QuaterMonthNumber(String month) {
      return switch (month.toLowerCase()) {
            case "January","February","March":
                yield "First";
            case "april","may","june":
              yield "second";
             case "july","augest","september":
              yield "third";
            case "octomber","november","december":
              yield "fourth";
            default:
              yield "Invalid";
      };
    }
}
