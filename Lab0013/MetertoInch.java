
//Write a Java program that reads a number in inches and converts it to meters.
  //      Note: One inch is 0.0254 meter.
       // Test Data
//Input a value for inch: 1000
        //Expected Output :
        //1000.0 inch is 25.4 meters


package Lab0013;

import java.util.Scanner;

public class MetertoInch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for inch:  ");
        double inches = (int) sc.nextDouble();
        double meters = 0.0254;
        //double output = meter * inches;
        //System.out.println("Expected Output:"+meters * inches);
        System.out.println(inches + " inch is " + meters + " meters");

    }
}
