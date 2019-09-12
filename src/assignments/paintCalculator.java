package assignments;
import java.util.Scanner;
public class paintCalculator {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int height;
        int length;
        int width;
        pl("Please enter the height of the room in feet, rounded to the nearest whole number.");
        height = keyboard.nextInt();
        pl("Please enter the length of the room in feet, rounded to the nearest whole number.");
        length = keyboard.nextInt();
        pl("Please enter the width of the room in feet, rounded to the nearest whole number.");
        width = keyboard.nextInt();
        roomAreaCalculator(height, length, width);
        gallonsNeeded(height);
        priceCalculator(height);
    }
    public static void roomAreaCalculator(int height, int length, int width){
        int areaOfRoom;
        areaOfRoom = ((height*length)*2)+((height*width)*2);
        pl("The room is " + areaOfRoom + " square feet in total.");
    }
    public static void gallonsNeeded(int areaOfRoom){
        final int PAINT_COVERAGE = 350;
        int gallonsNeeded;
        gallonsNeeded = areaOfRoom/PAINT_COVERAGE;
        pl("You will need " + gallonsNeeded + " gallons of paint to cover the room.");
    }
    public static void priceCalculator(int gallonsNeeded){
        final int PRICE_PER_GALLON = 32;
        int costOfPaint;
        costOfPaint = gallonsNeeded*PRICE_PER_GALLON;
        pl(gallonsNeeded + " gallons of paint will cost $" + costOfPaint + ".");
    }
    public static void pl(String p){System.out.println(p);}
}
