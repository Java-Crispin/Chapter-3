package assignments;
// This application displays some math facts
public class FixDebugThree2
{
    public static void main(String args[])
    {
        int a = 2, b = 5, c = 10;
        add(b, c);
        subtract(a,b);
    }
    public static void add(int b, int c)
    {
        System.out.println("The sum of " + c +
                " and " + b + " is " + (b + c));
    }
    public static void subtract(int a, int b){
        System.out.println("The difference between " +
                a + " and " + b + " is " +  (b - a));
    }
}