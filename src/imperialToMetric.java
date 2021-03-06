public class imperialToMetric {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches");
            return -1;
        }

        double feet = (int) inches / 12;
        double remInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet " + remInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remInches);
    }

}
