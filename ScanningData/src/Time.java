public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(){
        this(-1,-1,-1);
        System.out.println("Default constructor called");
    }

    public Time(int hour, int min, int sec){
        System.out.println("Param constructor called");
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time(int hour, int min){
        this(hour, min, 0);
    }




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

    @Override
    public String toString() {
        return hour+":"+min+":"+sec;
    }

//    public void printTime(){
//        System.out.println(hour+":"+min+":"+sec);
//    }
}
