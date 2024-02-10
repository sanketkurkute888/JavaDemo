public class BarkingDog {
  public boolean shouldWakeUp(boolean barking ,int hour)
    {


            if(barking)
            {

                if (hour < 0 || hour > 23)
                {
                    return false;
                }
                else if (hour < 8 || hour >  22)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
            else
            {
                return false;
            }

    }
}
