package assignments;
import java.util.Scanner;
public class metricConversion {
    public static void main(String[]args){
        double inches;
        double gallons;
        Scanner keyboard = new Scanner(System.in);
        pl("This program converts inches into centimeters, and gallons to litres.");
        pl("Please enter the amount of inches that you wish to convert");
        inches = keyboard.nextDouble();
        pl("Please enter the amount of gallons that you wish to convert");
        gallons = keyboard.nextDouble();
        inchesToCentimeters(inches);
        gallonsToLitres(gallons);
    }
    public static void inchesToCentimeters(double inches){
        final double CENTIMETERS_IN_AN_INCH = 2.54;
        double centimeters;
        centimeters = inches / CENTIMETERS_IN_AN_INCH;
        pl(inches + " inches is " + centimeters + " centimeters.");
    }
    public static void gallonsToLitres(double gallons){
        final double LITRES_IN_A_GALLON = 3.7854;
        double litres;
        litres = gallons / LITRES_IN_A_GALLON;
        pl(gallons + " gallons is " + litres + " litres.");
    }
    public static void pl(String p){System.out.println(p);}
}