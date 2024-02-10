public class SharedDigit {
    public boolean hasSharedDigit(int number1,int number2)
    {
        if((number1>=10&& number1<=99)&&(number2>=10&& number2<=99))
        {
            while (number1>0) //12 1>0
            {
                int rem1=number1%10; //12%10=2  1%10=1
                int temp=number2;  //34
                while (temp>0)   //34>0 3>0
                {
                    int rem2=temp%10;//  34%10=4  3%10=3
                     if(rem1==rem2)  //1==4  1==3
                     {
                         return true;
                     }
                    temp/=10;  //34/10=3  3/10=0
                }
                number1/=10;  //12 /10=1
            }
        }
        return false;
    }



}
