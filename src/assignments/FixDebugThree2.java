package assignments;
// This application displays some math facts
public class FixDebugThree2
{
    public static void main(String args[])
    {
        int a = 2, b = 5, c = 10;
        add(b, c);
        add(b, c);
        subtract(a,b);
    }
    public static void add(int a, double  b)
    {
        System.out.println("The sum of " + a +
                " and " + b + " is " + (a + b));
    }
    public static void subtract(int a, int b){
        System.out.println("The difference between " +
                a + " and " + b + " is " +  (a - b));
    }
}