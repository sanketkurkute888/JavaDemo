public class GreatestCommonDivisor {
    public int  getGreatestCommonDivisor(int first,int second)
    {
        if(first<10 || second <10)
        {
            return -1;
        }
        else//30
        {
              int i=1,gcd=-1;
               while (i<first||i<second) //12%1=0 ,12%2=0,12%3=0,12%4=0, 12%5=2,
               {
                    if(first %i==0&&second%i==0)
                    {
                        gcd=i;
                    }
                    i++;
               }
               return gcd;
        }
    }
}
