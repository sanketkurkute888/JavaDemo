public class SumOdd {
    //first method
    public boolean isOdd(int number)
    {
        if(number>0 && (number%2!=0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //second method
   public int  sumOdd(int start,int end)
    {
        int sum=0;
        if(end>=start && start>0 && end>0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum+=i;
                }
            }
            return sum;
        }
        else
        {
            return -1;
        }
    }
}
