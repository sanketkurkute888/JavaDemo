public class Time {

    public void getDurationString(int seconds)
    {
        if(seconds>=0) {
            int hour = (seconds / 60) / 60;
            int minute = (seconds / 60) % 60;
            seconds = seconds % 60;
            System.out.println(hour + ":" + minute + ":" + seconds);
            //return (hour + ":" + minute + ":" + seconds);
        }
        else {
            System.out.println("invalid second");

        }

    }

   public void getDurationString(int seconds, int minute)
    {
        if(minute>=0&&(seconds>=0&&seconds<=59)) {
            int hour = (minute / 60);
            minute = (seconds / 60) + (minute % 60);
            seconds = seconds % 60;
            System.out.println(hour + ":" + minute + ":" + seconds);
//            return (hour + ":" + minute + ":" + seconds);
        }
        else {
            System.out.println("invlalid seond or minute");

        }
    }




}
