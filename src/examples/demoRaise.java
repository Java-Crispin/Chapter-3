package examples;
import java.util.Scanner;
public class demoRaise {
    public static void main (String[]args){
        double salary;
        Scanner input = new Scanner(System.in);
        pl("What is your salary?");
        pl("Demonstrating some raises:");
        salary = input.nextDouble();
        predictRaise(salary);
    }
    public static void predictRaise(double salary){
        double newSalary;
        final double RAISE_RATE = 1.10;
        newSalary = salary * RAISE_RATE;
        pl("Current salary: " + salary + " \nAfter raise: " + newSalary);
    }
    public static void pl(String p){
        System.out.println(p);
    }
}