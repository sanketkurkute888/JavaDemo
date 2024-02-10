public class Entry {
    public static void main(String[] args) {
      LeapYear yearCheak=new LeapYear();
      if (yearCheak.isLeapYear(10000))
      {
          System.out.println("Leap year");
      }
      else
      {
          System.out.println("not a leap year");
      }
    }
}