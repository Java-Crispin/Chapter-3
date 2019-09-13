package assignments;
import java.util.Scanner;
public class paintCalculator {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        double height;
        double length;
        double width;
        pl("Please enter the height of the room in feet.");
        height = keyboard.nextDouble();
        pl("Please enter the length of the room in feet.");
        length = keyboard.nextDouble();
        pl("Please enter the width of the room in feet.");
        width = keyboard.nextDouble();
        roomAreaCalculator(height, length, width);
    }
    public static void roomAreaCalculator(double height, double length, double width){
        double areaOfRoom = ((height*length)*2)+((height*width)*2);
        pl("The room is " + areaOfRoom + " square feet in total.");
        gallonsNeeded(areaOfRoom);
    }
    public static void gallonsNeeded(double areaOfRoom){
        final double PAINT_COVERAGE = 350;
        double gallonsNeededA = areaOfRoom / PAINT_COVERAGE;
        double gallonsNeeded = Math.ceil(gallonsNeededA);
        pl("You will need " + gallonsNeeded + " gallons of paint to cover the room.");
        priceCalculator(gallonsNeeded);
    }
    public static void priceCalculator(double gallonsNeeded){
        final double PRICE_PER_GALLON = 32;
        double costOfPaint = gallonsNeeded * PRICE_PER_GALLON;
        pl( gallonsNeeded + "  gallons of paint will cost $" + costOfPaint + ".");
    }
    public static void pl(String p){System.out.println(p);}
}
