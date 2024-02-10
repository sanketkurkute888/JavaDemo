package ComputerInformation;

final public class Monitor {
//    data member


    private final String type;// LCD LED
    private final double responseTime;// 4ms/6ms

    private final int resolution;//

    public Monitor(String type, double responseTime, int resolution) {
        this.type = type;
        this.responseTime = responseTime;
        this.resolution = resolution;
    }


//getter


    public String getType() {
        return type;
    }

    public double getResponseTime() {
        return responseTime;
    }

    public int getResolution() {
        return resolution;
    }


//   methods
    public void monitorWorking()
    {
        System.out.println("monitor working");
    }

//  toString


    @Override
    public String toString() {
        return "Monitor{" +
                "type='" + type + '\'' +
                ", responseTime=" + responseTime +
                ", resolution=" + resolution +
                '}';
    }
}
