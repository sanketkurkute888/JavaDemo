public class CentimeterConversionMain {
    public static void main(String[] args) {
        CentimeterConversionProgram convert=new CentimeterConversionProgram();
        int feet = 5;
        int inches = 8;
        double result1 = convert.convertToCentimeters(feet, inches);
        System.out.println(feet + " feet and " + inches + " inches " + result1 + " centimeters");

        int inchesOnly = 68;
        double result2 = convert.convertToCentimeters(inchesOnly);
        System.out.println(inchesOnly + " inches  " + result2 + " centimeters");
    }
}