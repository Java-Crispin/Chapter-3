package assignments;
import java.util.Scanner;
public class fahrenheitToCelsius {
    public static void main(String[]args){
        double celsius;
        double fahrenheit ;
        Scanner keyboard = new Scanner(System.in);
   //     pl("Would you like to convert fahrenheit to celsius, or celsius to fahrenheit?");
        pl("Please enter the temperature in fahrenheit.");
        fahrenheit = keyboard.nextDouble();
        pl("Please enter the temperature in celsius");
       celsius = keyboard.nextDouble();
       fahrenheitToCelsius(fahrenheit);
       celsiusToFahrenheit(celsius);
    }
    public static void fahrenheitToCelsius(double fahrenheit){
        double convertedCelsius;
        convertedCelsius = (fahrenheit -32)*(.5555555555555);
        pl(fahrenheit + " degrees fahrenheit is " + convertedCelsius + " degrees celsius.");
    }
    public static void celsiusToFahrenheit(double celsius){
        double convertedFahrenheit;
        convertedFahrenheit = (celsius * (1.8)) + 32;
         pl(celsius + " degrees celsius is " + convertedFahrenheit + " degrees fahrenheit.");
    }
    public static void pl(String p){System.out.println(p);}
}