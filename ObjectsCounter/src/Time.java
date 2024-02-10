public class Time {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Time addTime(Time time){
        Time temp = new Time();
        temp.hour = this.hour + time.hour;
        temp.min = this.min + time.min;
        temp.sec = this.sec + time.sec;

        return temp;
    }

    public void printTime(){
        System.out.println(hour+":"+min+":"+sec);
    }

}


class Time1{
    private int hour;
   private int min;
   private int sec;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Time1 addTime(Time1 time){
        Time1 temp = new Time1();
        temp.hour = this.hour + time.hour;
        temp.min = this.min + time.min;
        temp.sec = this.sec + time.sec;

        return temp;
    }
    public void printTime()
    {
        System.out.println(hour+":"+min+":"+sec);
    }
}