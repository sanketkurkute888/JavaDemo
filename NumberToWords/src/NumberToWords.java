public class NumberToWords {
    public  void numberToWords(int number )
    {

        if(number<0)
        {
            System.out.println("Invalid value");
        }
        else{
        //        001            100
            int rev = reverse(number);

            //          3
            int count = getDigitCount(number);

            while(count > 0) {  //3>0
                int lastDigit = rev % 10; //
                rev = rev / 10;
                count--;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println();
                }
            }
        }
    }

   public int  reverse(int number)
   {
       int sum=0;
       if(number < 0) {
           number = -1 * number;

           while (number > 0) {
               int lastDigit = number % 10;
               sum = lastDigit + sum * 10;
               number /= 10;
           }
           return - sum;
       }
       while (number>0)
       {
           sum=sum*10+number%10;
           number/=10;
       }
       return sum;
   }
  public int getDigitCount(int number)
  {
      if(number<0)
      {
          return -1;
      }
      if(number==0)
      {
          return 1;
      }
      else {
          int count=0;
          while (number>0)
          {
              count++;
              number/=10;
          }
          return count;
      }
  }

}
