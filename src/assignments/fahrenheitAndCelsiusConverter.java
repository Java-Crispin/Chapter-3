package assignments;
import java.util.Scanner;
public class fahrenheitAndCelsiusConverter {
    public static void main(String[]args){
        int userInput;
        Scanner keyboard = new Scanner(System.in);
        pl("This program converts between degrees fahrenheit and degrees celsius.");
        pl("If you would like to convert fahrenheit to celsius, please enter the number 1. If you would like to convert celsius to fahrenheit, please enter the number 0.");
        userInput = keyboard.nextInt();
        fahrenheitToCelsius(userInput);
        celsiusToFahrenheit(userInput);
    }
    public static void fahrenheitToCelsius(int userInput){
        Scanner keyboard = new Scanner(System.in);
        double convertedCelsius;
        double fahrenheit;
        if(userInput == 1){
            pl("Please enter the temperature in fahrenheit.");
            fahrenheit = keyboard .nextDouble();
            convertedCelsius = (fahrenheit -32)*(.55);
            pl(fahrenheit + " degrees fahrenheit is " + convertedCelsius + " degrees celsius.");
        }
    }
    public static void celsiusToFahrenheit(int userInput){
        Scanner keyboard = new Scanner(System.in);
        double convertedFahrenheit;
        double celsius;
        if(userInput == 0){
            pl("Please enter the temperature in celsius");
            celsius = keyboard.nextDouble();
            convertedFahrenheit = (celsius * (1.8)) + 32;
            pl(celsius + " degrees celsius is " + convertedFahrenheit + " degrees fahrenheit.");
        }
    }
    public static void pl(String p){System.out.println(p);}
}