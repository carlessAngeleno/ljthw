import java.util.Scanner;

public class BMICalculator
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        double m, inch, totalInch, ft, lb, kg, bmi;
        double inchToM, ftToInch, lbToKg;

        inchToM = 0.0254;
        ftToInch = 12;
        lbToKg = 0.453592;

        System.out.print( "Your height (feet only): " );
        ft = keyboard.nextInt();

        System.out.print( "Your height (inches): " );
        inch = keyboard.nextDouble();

        totalInch = (ft * ftToInch) + inch;
        m = totalInch * inchToM;

        System.out.print( "Your weight in pounds: " );
        lb = keyboard.nextDouble();
        kg = lb * lbToKg;

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi );
    }
}
