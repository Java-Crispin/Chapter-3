package assignments;
import java.util.Scanner;
public class numbersDemo {
    public static void main(String[]args){
        int x;
        int y;
        Scanner keyboard = new Scanner(System.in);
        pl("Please input a number.");
        x = keyboard.nextInt();
        pl("Please input another number");
        y = keyboard.nextInt();
        displayTwiceTheNumber(x,y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);
    }
    public static void displayTwiceTheNumber(int x, int y){
        int x2;
        int y2;
        x2 = x * 2;
        y2 = y * 2;
       pl("The first number times two is " + x2 + ", and the second number times two is " + y2 + ".");
    }
    public static void displayNumberPlusFive(int x, int y){
     int x5;
     int y5;
     x5 = x + 5;
     y5 = y + 5;
    pl("The first number plus five is " + x5 + ", and the second number plus five is " + y5 + ".");
    }
    public static void displayNumberSquared(int x, int y){
        int xx;
        int yy;
        xx = x * x;
        yy = (int)Math.pow(y,2);
        pl("The first number squared is " + xx + ", and the second number squared is " + yy + " .");
    }
    public static void pl(String p){
        System.out.println(p);
    }
}
