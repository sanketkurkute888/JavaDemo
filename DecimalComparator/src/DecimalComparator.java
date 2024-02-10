public class DecimalComparator {
    public int areEqualByThreeDecimalPlaces(double number1,double number2)
    {
         number1=number1*1000;
         number2=number2*1000;
          int rem1=(int)(number1*1000%10);
          int rem2=(int)(number2*1000%10);
          int i=0,flag=1;
          while (number1>0||number2>0)
          {
                  if(rem1==rem2) {
                      number1 = number1 / 10;
                      number2 = number2 / 10;
                      rem1 = (int) (number1 % 10);
                      rem2 = (int) (number2 % 10);
                  }
                  else
                  {
                      return 0;
                  }
              i++;
          }
         return flag;

    }
}
