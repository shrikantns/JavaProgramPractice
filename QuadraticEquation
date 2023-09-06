package Lab0025;

import java.util.Scanner;

public class QuatracticEquation {
    public static void main(String[] args) {
        //Write a Java program to solve quadratic equations (use if, else if and else).
        //Test Data
        //Input a: 1
        //Input b: 5
        //Input c: 1
        //Expected Output :
        //The roots are -0.20871215252208009 and -4.791287847477919

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a : ");
        double a = sc.nextDouble();
        System.out.print("Input b : ");
        double b = sc.nextDouble();
        System.out.print("Input c : ");
        double c = sc.nextDouble();
        double discriminant = b*b - 4*a*c;
        if (discriminant>0){
           double root1 = (double) (-b + Math.sqrt(discriminant))/2*a;
           double root2 = (double) (-b - Math.sqrt(discriminant))/2*a;
            System.out.println("The roots are " +root1+ "and" +root2);
        }
        else if (discriminant==0){
            double root1 = -b/2*a;
            System.out.println("The roots are " +root1);
        }
        else {
            System.out.println("The equation has no real roots.");
        }

    }
}
