package assignments;
import java.util.Scanner;
public class poundConverter {
    public static void main(String[]args){
        double userInputPounds;
        Scanner input = new Scanner(System.in);
        pl("How many pounds would you like to convert?");
        userInputPounds = input.nextDouble();
        poundsToKilograms(userInputPounds);
        poundsToOunces(userInputPounds);
        poundsToMilligrams(userInputPounds);
    }
    public static void poundsToKilograms(double pounds){
        double kilograms = pounds/2.205;
        pl(pounds + " pounds is " + kilograms + " kilograms.");
    }
    public static void poundsToOunces(double pounds){
        double ounces = pounds/16;
        pl( pounds + " pounds is " + ounces + " ounces.");
    }
    public static void poundsToMilligrams(double pounds){
        double milligrams = pounds*453592.37;
        pl(pounds + " pounds is " + milligrams + " milligrams.");
    }
    public static void pl(String p){System.out.println(p);}
}
