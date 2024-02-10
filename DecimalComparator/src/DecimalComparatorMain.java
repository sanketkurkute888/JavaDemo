public class DecimalComparatorMain {
    public static void main(String[] args) {
        DecimalComparator Decimalcheak=new DecimalComparator();
              int flag=Decimalcheak.areEqualByThreeDecimalPlaces(3.7234,3.1235);
              if(flag==1)
              {
                  System.out.println("equal upto 3 decimal places");
              }
              else
              {
                  System.out.println("not equal");
              }
    }
}