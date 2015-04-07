import java.util.Scanner;

public class BMICalculator
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        double m, inch, lb, kg, bmi;
        double inchToM, lbToKg;

        inchToM = 0.0254;
        lbToKg = 0.453592;

        System.out.print( "Your height in inches: " );
        inch = keyboard.nextDouble();
        m = inch * inchToM;

        System.out.print( "Your weight in pounds: " );
        lb = keyboard.nextDouble();
        kg = lb * lbToKg;

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi );
    }
}
