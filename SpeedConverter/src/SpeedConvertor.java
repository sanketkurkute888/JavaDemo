public class SpeedConvertor {
    public long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            return Math.round(milesPerHour);


        }

    }

    public void printConversion(double kilometersPerHour) {
        long convertedSpeed = toMilesPerHour(kilometersPerHour);
        if (convertedSpeed == -1) {
            System.out.println("Invalid kilometer enter");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + convertedSpeed + " mi/h");
        }
    }

}