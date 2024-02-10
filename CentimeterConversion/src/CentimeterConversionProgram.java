public class CentimeterConversionProgram {
    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        double centimeters = totalInches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }
}
