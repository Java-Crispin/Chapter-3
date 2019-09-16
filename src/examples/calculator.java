package examples;
import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        //create a calculator that accepts two inputs from a user
        //we will need two variables
        int userEntry1;
        int userEntry2;
        Scanner input = new Scanner(System.in);
        pl("Enter a number.");
        userEntry1 = input.nextInt();
        pl("Enter another number.");
        userEntry2 = input.nextInt();
        calculateAddition(userEntry1, userEntry2, " + ");
        calculateSubtraction(userEntry1, userEntry2, " - ");
        calculateMultiplication(userEntry1, userEntry2, " * ");
        calculateDivision(userEntry1, userEntry2, " / ");
        calculateModules(userEntry1, userEntry2, " % ");
    }
    public static void calculateAddition(int num1, int num2, String sign){
        int total = num1 + num2;
        pl(num1 + sign + num2 + " = " + total);
    }
    public static void calculateSubtraction(int num1, int num2, String sign) {
        int total = num1 - num2;
        pl(num1 + sign + num2 + " = " + total);
    }
    public static void calculateMultiplication(int num1, int num2, String sign) {
        int total = num1 * num2;
        pl(num1 + sign + num2 + " = " + total);
    }
    public static void calculateDivision(int num1, int num2, String sign) {
        int total = num1 / num2;
        pl(num1 + sign + num2 + " = " + total);
    }
    public static void calculateModules(int num1, int num2, String sign) {
        int total = num1 % num2;
        pl(num1 + sign + num2 + " = " + total);
    }
    public static void pl(String p ){System.out.println(p);}
}