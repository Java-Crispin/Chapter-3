package assignments;
import java.util.Scanner;
public class celsiusToFahrenheit {
    public static void main(String[]args){
        double tempAt8;
        double tempAt12;
        double tempAt5;
        Scanner keyboard = new Scanner(System.in);
        pl("Please enter the temperature at 8:00am");
        tempAt8 = keyboard.nextDouble();
        pl("Please enter the temperature at 12:00pm");
        tempAt12 = keyboard.nextDouble();
        pl("Please enter the temperature at 5:00mp");
        tempAt5 = keyboard.nextDouble();
        completeTempAt8(tempAt8);
        completeTempAt12(tempAt12);
        completeTempAt5(tempAt5);
    }
    public static void completeTempAt8(double tempAt8){
        double celsius;
        celsius = (tempAt8-32)*(9/5);
        pl("At 8:00am it was " + tempAt8 + " degrees fahrenheit is " + celsius + " degrees celsius.");
    }
    public static void completeTempAt12(double tempAt12){
        double celsius;
        celsius = (tempAt12-32)*(9/5);
        pl("At 12:00pm it was " + tempAt12 + " degrees fahrenheit is " + celsius + " degrees celsius.");
    }
    public static void completeTempAt5(double tempAt5){
        double celsius;
        celsius = (tempAt5-32)*(9/5);
        pl("At 5:00pm it was " + tempAt5 + " degrees fahrenheit is " + celsius + " degrees celsius.");
    }
    public static void pl(String p){System.out.println(p);}
}