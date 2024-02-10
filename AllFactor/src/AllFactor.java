public class AllFactor {
    public void printFactor(int number)
    {
        if(number<0)
        {
            System.out.println("invalid value");
        }
        else
        {
            for (int i = 1; i <=number ; i++) {
                if(number%i==0)
                {
                    System.out.print(+i+"\t");
                }
            }
            System.out.println("\n");
        }
    }

}
