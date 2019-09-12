package assignments;
import java.util.Scanner;
public class percentages {
    public static void main(String[]args){
        double number1;
        double number2;
        Scanner keyboard = new Scanner(System.in);
        pl("Please input a number.");
        number1 = keyboard.nextInt();
        pl("Please input another number.");
        number2 = keyboard.nextInt();
        computePercent(number1, number2);
    }
    public static void computePercent(double number1, double number2){
        double num1PercentNum2;
        double num2PercentNum1;
        num1PercentNum2 = number1/number2*100;
        num2PercentNum1 = number2/number1*100;
        pl(number1 + " is " + num1PercentNum2 + "% of " + number2);
        pl(number2 + " is " + num2PercentNum1 + "% of " + number1);
    }
    public static void pl(String p){System.out.println(p);}
}
