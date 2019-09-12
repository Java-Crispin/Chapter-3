package assignments;
import java.util.Scanner;
public class bookstoreCredit {
    public static void main(String[]args){
        String name;
        double gpa;
        final int GPA_TO_CREDITS = 10;
        Scanner keyboard = new Scanner(System.in);
        pl("Please enter your name.");
        name = keyboard.next();
        pl("Please enter your grade point average.");
        gpa = keyboard.nextDouble();
        creditCalculator(gpa, name );
    }
    public static void creditCalculator(double gpa, String name){
        double creditsEarned;
        double credits;
        creditsEarned = gpa * 10;
        credits = creditsEarned;
        pl("Congratulations, " + name + " because of your " + gpa + " grade point average, you have earned $"
                + credits + " bookstore credits, keep up the hard work");
    }
    public static void pl(String p){System.out.println(p);}
}